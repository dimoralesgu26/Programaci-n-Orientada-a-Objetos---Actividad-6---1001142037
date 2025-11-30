/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejerciciopropuesto84;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;

/**

* @author USER
 */
public class VentanaAgregarEmpleado extends javax.swing.JFrame {
 private ListaEmpleados lista;  
 
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaAgregarEmpleado.class.getName());

    /**
     * Creates new form VentanaNomina
     */
    public VentanaAgregarEmpleado(ListaEmpleados lista) {
        initComponents();
        this.lista = lista;
        setTitle("Agregar Empleado");
        setSize(400,400);
        setLocationRelativeTo(null); 
        setResizable(false);
        
        Masculino = new JRadioButton("Masculino", true);
        grupoGenero.add(Masculino); 
        Femenino = new JRadioButton("Femenino");
        grupoGenero.add(Femenino);
        SpinnerNumberModel modeloSpinner = new SpinnerNumberModel();
        modeloSpinner.setMinimum(1);
        modeloSpinner.setMaximum(31);
        modeloSpinner.setValue(30);
        campoNumeroDias.setModel(modeloSpinner);
            }

    private VentanaAgregarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
private void añadirEmpleado() {
TipoCargo tipoC;
String itemSeleccionado = (String) campoCargo.getSelectedItem();
    if (itemSeleccionado == "Directivo") {
        tipoC = TipoCargo.DIRECTIVO;
    } else if (itemSeleccionado == "Estrategico") {
        tipoC = TipoCargo.ESTRATEGICO;
    } else {
        tipoC = TipoCargo.OPERATIVO;
    }

TipoGenero tipoG;
    if (Masculino.isSelected()) {
        tipoG = TipoGenero.MASCULINO;
    } else {
        tipoG = TipoGenero.FEMENINO;
    }

try {
String valor1 = campoNombre.getText(); 
String valor2 = campoApellidos.getText(); 
double valor3 = Double.parseDouble(campoSalarioDia.getText());
int valor4 = (int) campoNumeroDias.getValue();
double valor5 = Double.parseDouble(campoOtrosIngresos.getText());
double valor6 = Double.parseDouble(campoSalud.getText());
double valor7 = Double.parseDouble(campoPensiones.getText());

Empleado e = new Empleado(valor1, valor2, tipoC, tipoG, valor3, valor4, valor5, valor6, valor7); 
lista.agregarEmpleado(e); 
        JOptionPane.showMessageDialog(this,"El empleado ha sido agregado","Mensaje", JOptionPane.INFORMATION_MESSAGE,null);
        limpiarCampos();
    } catch (Exception e) { 
        JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de numero", "Error", JOptionPane.ERROR_MESSAGE);
}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoGenero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoCargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoSalarioDia = new javax.swing.JTextField();
        campoOtrosIngresos = new javax.swing.JTextField();
        campoSalud = new javax.swing.JTextField();
        campoPensiones = new javax.swing.JTextField();
        campoNumeroDias = new javax.swing.JSpinner();
        agregar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        Masculino = new javax.swing.JRadioButton();
        Femenino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Empleado");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Cargo:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Género:");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directivo", "Estrategico", "Operativo" }));
        campoCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCargoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Salario por día:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Días trabajados al mes:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Otros ingresos:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Pagos por salud:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Aportes pensiones:");

        campoSalarioDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalarioDiaActionPerformed(evt);
            }
        });

        campoNumeroDias.setToolTipText("modeloSpinner");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        grupoGenero.add(Masculino);
        Masculino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Masculino.setText("Masculino");

        grupoGenero.add(Femenino);
        Femenino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Femenino.setText("Femenino");
        Femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemeninoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoCargo, 0, 164, Short.MAX_VALUE)
                                .addComponent(campoNombre)
                                .addComponent(campoApellidos))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoPensiones, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoSalud, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoOtrosIngresos, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(campoSalarioDia, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Masculino)
                            .addComponent(Femenino)
                            .addComponent(campoNumeroDias, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiar)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Masculino))
                .addGap(2, 2, 2)
                .addComponent(Femenino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoSalarioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoNumeroDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoOtrosIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campoSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoPensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(limpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCargoActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        añadirEmpleado();
    }//GEN-LAST:event_agregarActionPerformed

    private void campoSalarioDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalarioDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalarioDiaActionPerformed
    public void limpiarCampos() {
        campoNombre.setText("");
        campoApellidos.setText("");
        campoSalarioDia.setText("");
        campoNumeroDias.setValue(0);
        campoOtrosIngresos.setText("");
        campoSalud.setText("");
        campoPensiones.setText("");
}
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void FemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemeninoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaAgregarEmpleado().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Femenino;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JComboBox<String> campoCargo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JSpinner campoNumeroDias;
    private javax.swing.JTextField campoOtrosIngresos;
    private javax.swing.JTextField campoPensiones;
    private javax.swing.JTextField campoSalarioDia;
    private javax.swing.JTextField campoSalud;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables
}

