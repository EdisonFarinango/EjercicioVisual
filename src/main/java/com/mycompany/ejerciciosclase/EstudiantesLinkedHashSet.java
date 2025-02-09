/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejerciciosclase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class EstudiantesLinkedHashSet extends javax.swing.JFrame {

    private static final String ARCHIVO_ESTUDIANTES = "estudiantes.txt";
    private Set<String> estudiantes;
    private DefaultTableModel tableModel;

    public EstudiantesLinkedHashSet() {
        initComponents();
        estudiantes = new LinkedHashSet<>();
        tableModel = (DefaultTableModel) jTable1.getModel(); 
        cargarEstudiantes();
        mostrarEstudiantes();
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

        jPanel1 = new javax.swing.JPanel();
        nombreField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnAgregarEst = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        mensajeLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreField.setBorder(null);
        jPanel1.add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 270, 30));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 270, 2));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        btnAgregarEst.setBackground(new java.awt.Color(100, 149, 237));
        btnAgregarEst.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAgregarEst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarEst.setText("Añadir Estudiante");
        btnAgregarEst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEstMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarEst, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        btnSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("Cerrar");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombres de Estudiantes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 560, 340));
        jPanel1.add(mensajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 270, 30));

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEstMouseClicked
    String nombreCompleto = nombreField.getText().trim().toLowerCase();
    if (!nombreCompleto.isEmpty()) {
        agregarEstudiante(nombreCompleto);
        mostrarEstudiantes();
    } else {
        mensajeLabel.setText("El campo de nombre está vacío.");
    }
    }//GEN-LAST:event_btnAgregarEstMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

private void cargarEstudiantes() {
    try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_ESTUDIANTES))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            estudiantes.add(linea.toLowerCase());
        }
    } catch (IOException e) {
        mensajeLabel.setText("No se pudo cargar el archivo de estudiantes.");
    }
}

    private void guardarEstudiantes() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_ESTUDIANTES))) {
            for (String estudiante : estudiantes) {
                bw.write(estudiante);
                bw.newLine();
            }
        } catch (IOException e) {
            mensajeLabel.setText("No se pudo guardar el archivo de estudiantes.");
        }
    }

private void agregarEstudiante(String nombreCompleto) {
    if (estudiantes.add(nombreCompleto)) {
        mensajeLabel.setText("Estudiante agregado.");
        guardarEstudiantes();
        nombreField.setText("");
    } else {
        mensajeLabel.setText("El estudiante ya está en la lista SOY JAIR XD.");
    }
}

    private void mostrarEstudiantes() {
        tableModel.setRowCount(0); 
        for (String estudiante : estudiantes) {
            tableModel.addRow(new Object[]{estudiante});
        }
    }

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
            java.util.logging.Logger.getLogger(EstudiantesLinkedHashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudiantesLinkedHashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudiantesLinkedHashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudiantesLinkedHashSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudiantesLinkedHashSet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarEst;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}
