/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

import java.util.Hashtable;
import javax.swing.JOptionPane;
import jpl.Query;
import jpl.Term;

/**
 *
 * @author User
 */
public class Diagnostico extends javax.swing.JFrame {

    private Term salida;
    private String enfermedadesConstantes = ""
            + "resfriado_comun,"
            + "dengue,"
            + "chikungunya,"
            + "gastritis,"
            + "artritis,"
            + "lechina,"
            + "sarampion,"
            + "leucemia,"
            + "conjuntivitis,"
            + "agmidalitis,"
            + "prueba";

    public Diagnostico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sintoma1 = new javax.swing.JCheckBox();
        sintoma3 = new javax.swing.JCheckBox();
        sintoma5 = new javax.swing.JCheckBox();
        sintoma7 = new javax.swing.JCheckBox();
        sintoma9 = new javax.swing.JCheckBox();
        sintoma2 = new javax.swing.JCheckBox();
        sintoma10 = new javax.swing.JCheckBox();
        sintoma8 = new javax.swing.JCheckBox();
        sintoma6 = new javax.swing.JCheckBox();
        sintoma4 = new javax.swing.JCheckBox();
        sintoma11 = new javax.swing.JCheckBox();
        diagnosticar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pacientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enfermedades = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        presentaciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 48)); // NOI18N
        jLabel3.setText("Diagnóstico de Enfermedades");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione los síntomas que presenta"));

        sintoma1.setText("1. Congestión Nasal");

        sintoma3.setText("3. Dolor de Garganta");

        sintoma5.setText("5. Dolor en los Huesos");

        sintoma7.setText("7. Inflamación");

        sintoma9.setText("9. Nauseas");

        sintoma2.setText("2. Dolor de Cabeza");

        sintoma10.setText("10. Vómito");

        sintoma8.setText("8. Dolor en Articulaciones");

        sintoma6.setText("6. Comezón");

        sintoma4.setText("4. Fiebre");

        sintoma11.setText("11. Visión Borrosa");

        diagnosticar.setText("Diagnosticar");
        diagnosticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sintoma11)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sintoma1)
                                .addComponent(sintoma3)
                                .addComponent(sintoma5)
                                .addComponent(sintoma7)
                                .addComponent(sintoma9))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sintoma2)
                                .addComponent(sintoma4)
                                .addComponent(sintoma6)
                                .addComponent(sintoma8)
                                .addComponent(sintoma10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(diagnosticar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sintoma1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sintoma2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sintoma10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sintoma11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diagnosticar)
                .addContainerGap())
        );

        jLabel1.setText("Paciente");

        pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Número", "Nombre", "Síntomas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pacientes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(paciente)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pacientes", jPanel2);

        enfermedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Enfermedad", "Nombre", "Ocurrencias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(enfermedades);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historial Enfermedades", jPanel3);

        presentaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Enfermedad", "Código Síntoma", "Ocurrencias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(presentaciones);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Historial de Presentaciones", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diagnosticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticarActionPerformed
        if (paciente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre del paciente");
            jTabbedPane1.setSelectedIndex(0);
            paciente.requestFocus();
            return;
        }

        //no debe consultar de nuevo
        //debe consultar todas las enfermedades para comparar si retorna bien
        //consultar todos los sintomas para hacer botones dinamicos
        String s = "consult('diagnostico.pl')";
        Query q = new Query(s);
        System.out.println(s + "   " + q.hasSolution());
        System.out.println("Soluciones :");
        String sintomas = prepararSintimas().toString();
//        System.out.println(sintomas);
        s = "diagnostico(" + paciente.getText() + "," + sintomas + ",Enfermedad).";
        System.out.println(s);
        Query q1 = new Query(s);
        while (q1.hasMoreSolutions()) {
            java.util.Hashtable h = q1.nextSolution();
            if (enfermedadesConstantes.contains(h.get("Enfermedad").toString())) {
                System.out.println("Enfermedad = " + h.get("Enfermedad"));
            }
        }

    }//GEN-LAST:event_diagnosticarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diagnostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton diagnosticar;
    private javax.swing.JTable enfermedades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField paciente;
    private javax.swing.JTable pacientes;
    private javax.swing.JTable presentaciones;
    private javax.swing.JCheckBox sintoma1;
    private javax.swing.JCheckBox sintoma10;
    private javax.swing.JCheckBox sintoma11;
    private javax.swing.JCheckBox sintoma2;
    private javax.swing.JCheckBox sintoma3;
    private javax.swing.JCheckBox sintoma4;
    private javax.swing.JCheckBox sintoma5;
    private javax.swing.JCheckBox sintoma6;
    private javax.swing.JCheckBox sintoma7;
    private javax.swing.JCheckBox sintoma8;
    private javax.swing.JCheckBox sintoma9;
    // End of variables declaration//GEN-END:variables

    private StringBuilder prepararSintimas() {
        StringBuilder sintomas = new StringBuilder("[");
        if (sintoma1.isSelected()) {
            sintomas.append("congestion_nasal,");
        }
        if (sintoma2.isSelected()) {
            sintomas.append("dolor_de_cabeza,");
        }
        if (sintoma3.isSelected()) {
            sintomas.append("dolor_de_garganta,");
        }
        if (sintoma4.isSelected()) {
            sintomas.append("fiebre,");
        }
        if (sintoma5.isSelected()) {
            sintomas.append("dolor_en_los_huesos,");
        }
        if (sintoma6.isSelected()) {
            sintomas.append("comezon,");
        }
        if (sintoma7.isSelected()) {
            sintomas.append("inflamacion,");
        }
        if (sintoma8.isSelected()) {
            sintomas.append("dolor_en_articulaciones,");
        }
        if (sintoma9.isSelected()) {
            sintomas.append("nauseas,");
        }
        if (sintoma10.isSelected()) {
            sintomas.append("vomito,");
        }
        if (sintoma11.isSelected()) {
            sintomas.append("vision_borrosa,");
        }

        //por si tiene una coma al final
        if (sintomas.charAt(sintomas.length() - 1) == ',') {
            sintomas.setCharAt(sintomas.length() - 1, ']');
        } else {
            sintomas.append("]");
        }
        return sintomas;
    }
}