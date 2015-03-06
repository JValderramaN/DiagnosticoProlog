:-dynamic paciente/3,enfermedad/3,presentacion/3.

%enfermedades
enfermedad(1,resfriado_comun,0).
enfermedad(2,dengue,0).
enfermedad(3,chikungunya,0).
enfermedad(4,gastritis,0).
enfermedad(5,artritis,0).
enfermedad(6,lechina,0).
enfermedad(7,sarampion,0).
enfermedad(8,leucemia,0).
enfermedad(9,conjuntivitis,0).
enfermedad(10,agmidalitis,0).
enfermedad(11,prueba,0).

%sintomas
sintoma(1,congestion_nasal).
sintoma(2,dolor_de_cabeza).
sintoma(3,dolor_de_garganta).
sintoma(4,fiebre).
sintoma(5,dolor_en_los_huesos).
sintoma(6,comezon).
sintoma(7,inflamacion).
sintoma(8,dolor_en_articulaciones).
sintoma(9,nauseas).
sintoma(10,vomito).
sintoma(11,vision_borrosa).


%presentacion de sintomas en enfermedades

%resfriado comun
presentacion(1,3,0).
presentacion(1,4,0).
presentacion(1,5,0).
%dengue
presentacion(2,2,0).
presentacion(2,4,0).
presentacion(2,8,0).
presentacion(2,9,0).
%chikungunya
presentacion(3,2,0).
presentacion(3,4,0).
presentacion(3,5,0).
presentacion(3,8,0).
%gastritis
presentacion(4,9,0).
presentacion(4,10,0).
%artritis
presentacion(5,7,0).
presentacion(5,8,0).
%lechina
presentacion(6,1,0).
presentacion(6,2,0).
presentacion(6,3,0).
presentacion(6,4,0).
presentacion(6,6,0).
%sarampion
presentacion(7,3,0).
presentacion(7,4,0).
presentacion(7,8,0).
%leucemia
presentacion(8,4,0).
%conjuntivitis
presentacion(9,7,0).
presentacion(9,11,0).

%prueba repetido
presentacion(11,7,0).
presentacion(11,8,0).
%presentacion(11,9,0).

%amidalitis
presentacion(10,2,0).
presentacion(10,3,0).
presentacion(10,4,0).


%paciente(0,jose,[]).
%paciente(1,jose2,[]).
%paciente(4,jose3,[]).
%paciente(2,jose4,[]).
paciente(0,0,0).

%retorna el ultimo paciente registrado
ultimo_paciente(COD):-paciente(COD,_,_), not(hayMasViejos(COD)),!.

%verifica si hay un paciente mas con registro mas viejo del recibido
hayMasViejos(COD):-paciente(COD,_,_),paciente(OtroCOD,_,_),OtroCOD\=COD,OtroCOD>COD.

%agrega el paciente si lo reconoce
agregar_paciente(Nombre,Sintomas):-paciente(COD,Nombre,_),retract(paciente(COD,Nombre,_)), asserta(paciente(COD,Nombre,Sintomas)),!.
%agrega el paciente si no lo reconocio antes, esta vez con contador+1
agregar_paciente(Nombre,Sintomas):-ultimo_paciente(COD),COD1 is COD +1,asserta(paciente(COD1,Nombre,Sintomas)),!.

% recorre todas las presentaciones de un sintoma en todas las
% enfermedades y aumenta su contador
update_presentacion([]).
%update_presentacion([Sintoma|Sintomas]):-
%	sintoma(CodS,Sintoma),
%	presentacion(CodE,CodS,CP),
%	CP1 is CP+1,
%	retract(presentacion(CodE,CodS,CP)),
%	asserta(presentacion(CodE,CodS,CP1)),
%	update_presentacion(Sintomas),!.

update_presentacion([Sintoma|Sintomas]):-
	sintoma(CodS,Sintoma),
	update_presentacion(CodS);
	update_presentacion(Sintomas).

update_presentacion(CodS):-presentacion(CodE,CodS,CP),CP1 is CP+1,retract(presentacion(CodE,CodS,CP)),asserta(presentacion(CodE,CodS,CP1)).

%actualiza una enfermedad para su contador +1
update_enfermedad(CodE):-retract(enfermedad(CodE,N,C)),C1 is
C+1,asserta(enfermedad(CodE,N,C1)).

% llamada inicial, recibe nombre y sintomas del paciente, retorna la(s)
% enfermedad(es) si la(s) hay
diagnostico(Nombre,Sintomas,Enfermedad):-
	agregar_paciente(Nombre,Sintomas),
	update_presentacion(Sintomas);
	diagnosticar(Sintomas,Enfermedad).


% recibe una lista de sintomas y retorna una enfermedad que los contenga
% todos

diagnosticar(Sintomas,Enfermedad):-
	enfermedad(CodE,_,_),
	findall(CodE,presentacion(CodE,_,_),Ocurrencia),
	length(Ocurrencia,CO),
	length(Sintomas,CS),
	CO == CS,
	diagnosticar_enfermedad(Sintomas,CodE,Enfermedad).
	%,update_enfermedad(CodE).


diagnosticar_enfermedad([],CodE,Enfermedad):-enfermedad(CodE,Enfermedad,_),update_enfermedad(CodE).

diagnosticar_enfermedad([Sintoma|Sintomas],CodE,Enfermedad):-
	sintoma(CodS,Sintoma),
	presentacion(CodE,CodS,_),
	diagnosticar_enfermedad(Sintomas,CodE,Enfermedad),!.

%***

% concatenar(L1,L2,L3)

%concatenar([ ], L, L).
%concatenar([X|C1],L2,[X|C3]) :-concatenar(C1,L2,C3).

% recibe sintomas, retorna una lista de enfermedades

%diagnostico(Sintomas,L,Enfermedades):-
%	diagnosticar_enfermedad(Sintomas,CodE),
%	enfermedad(CodE,Enfermedad),
%	concatenar([Enfermedad],L,Enfermedades).





