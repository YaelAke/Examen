/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;
import models.TablaPeriodica;
import static models.TablaPeriodica.tabla;

/**
 *
 * @author Yael
 */
public class Principal extends javax.swing.JFrame {

    DefaultTableModel dtmTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.txtRecNo.setText("-1");
        this.txtRecNo.setVisible(false);
        this.cartelrecNo.setVisible(false);
        tblElementos.repaint();
        TablaPeriodica.llenar();
        setModelo();
        setDatos();
        

    }

    private void limpiarCampos() {
        this.txtId.setText("");
        this.txtMasa.setText("");
        this.txtNombre.setText("");
        this.txtNumero.setText("");
        this.txtSimbolo.setText("");
        this.txtColor.setText("");
        this.txtRecNo.setText("-1");
    }

    private void setModelo() {
        String[] tlbCabecera = {"No", "ID", "MASA", "N. ATOMICO", "SIMBOLO", "NOMBRE", "COLOR"};
        dtmTabla.setColumnIdentifiers(tlbCabecera);
        tblElementos.setModel(dtmTabla);
    }

    private void setDatos() {
        Object[] datos = new Object[tblElementos.getColumnCount()];
        int i = 0;
        dtmTabla.setRowCount(0);
        for (TablaPeriodica tablaperiodica : tabla) {
            datos[0] = i;
            datos[1] = tablaperiodica.getId();
            datos[2] = tablaperiodica.getMasaAtomica();
            datos[3] = tablaperiodica.getNumeroAtomico();
            datos[4] = tablaperiodica.getSimboloQuimico();
            datos[5] = tablaperiodica.getNombre();
            datos[6] = tablaperiodica.getColor();
            i++;
            dtmTabla.addRow(datos);
        }
        tblElementos.setModel(dtmTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        cartelrecNo = new javax.swing.JLabel();
        cartelId = new javax.swing.JLabel();
        cartelNombre = new javax.swing.JLabel();
        cartelMasa = new javax.swing.JLabel();
        cartelColor = new javax.swing.JLabel();
        cartelSimbolo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblElementos = new javax.swing.JTable();
        txtRecNo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtMasa = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtSimbolo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JToggleButton();
        btnExportar = new javax.swing.JButton();
        carterlNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));

        cartelrecNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartelrecNo.setText("RECNO:");

        cartelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartelId.setText("ID:");

        cartelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartelNombre.setText("NOMBRE");

        cartelMasa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartelMasa.setText("MASA ATOMICA");

        cartelColor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartelColor.setText("COLOR");

        cartelSimbolo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartelSimbolo.setText("SIMBOLO");

        tblElementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblElementos);

        txtSimbolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSimboloActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });

        btnExportar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExportar.setText("EXPORTAR");
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
        });

        carterlNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carterlNumero.setText("N. ATOMICO");

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cartelNombre)
                            .addComponent(cartelMasa)
                            .addComponent(cartelId)
                            .addComponent(cartelSimbolo)
                            .addComponent(cartelColor)
                            .addComponent(carterlNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(cartelrecNo)
                        .addGap(18, 18, 18)
                        .addComponent(txtRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cartelrecNo))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnAceptar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cartelId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartelNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cartelMasa)
                            .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartelSimbolo)
                    .addComponent(txtSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carterlNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartelColor))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportar)
                        .addGap(126, 126, 126))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        int id = Integer.parseInt(this.txtId.getText().trim());
        int recNo = Integer.parseInt(this.txtRecNo.getText().trim());
        String masaAtomica = this.txtMasa.getText();
        String numeroAtomico = this.txtNumero.getText();
        String simboloQuimico = this.txtSimbolo.getText();
        String nombre = this.txtNombre.getText();
        String color = this.txtColor.getText();

        if (recNo == -1) {
            TablaPeriodica.añadir(id, masaAtomica, numeroAtomico, simboloQuimico, nombre, color);
        } else {
            System.out.println("Actualizando datos...");
            TablaPeriodica.actualizar(recNo, id, masaAtomica, numeroAtomico, simboloQuimico, nombre, color);
            this.btnActualizar.setSelected(false);
            System.out.println(tabla);
        }
        setDatos();
        limpiarCampos();


    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        int filaActual = tblElementos.getSelectedRow();
        System.out.println(filaActual);
        if (btnActualizar.isSelected()) {
            if (filaActual != -1) {
                System.out.println(dtmTabla.getValueAt(filaActual, 0));
                System.out.println(dtmTabla.getValueAt(filaActual, 1));
                System.out.println(dtmTabla.getValueAt(filaActual, 2));
                System.out.println(dtmTabla.getValueAt(filaActual, 3));
                System.out.println(dtmTabla.getValueAt(filaActual, 5));
                System.out.println(dtmTabla.getValueAt(filaActual, 6));

                this.txtRecNo.setText("" + dtmTabla.getValueAt(filaActual, 0));
                this.txtId.setText("" + dtmTabla.getValueAt(filaActual, 1));
                this.txtMasa.setText("" + dtmTabla.getValueAt(filaActual, 2));
                this.txtNumero.setText("" + dtmTabla.getValueAt(filaActual, 3));
                this.txtSimbolo.setText("" + dtmTabla.getValueAt(filaActual, 4));
                this.txtNombre.setText("" + dtmTabla.getValueAt(filaActual, 5));
                this.txtColor.setText("" + dtmTabla.getValueAt(filaActual, 6));
            } else {
                System.out.println("Debe seleccionar un registro..");
                this.btnActualizar.setSelected(false);
            }
        } else {
            limpiarCampos();
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int filaActual = tblElementos.getSelectedRow();
        System.out.println(filaActual);
        if (filaActual != -1) {
            System.out.println(tabla);
            TablaPeriodica.eliminar(filaActual);
            setDatos();
            System.out.println(tabla);
        }

    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
        // TODO add your handling code here:
        System.out.println("Inico guardar archivo");
        File archivo = new File("C:\\Users\\yaelc\\Documents\\Test\\tblTabla.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            for (TablaPeriodica tablaperiodica : tabla) {
                escribir.print(tablaperiodica.toString() + "\n");
            }
            escribir.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        System.out.println("Archivo guardado");

    }//GEN-LAST:event_btnExportarMouseClicked

    private void txtSimboloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimboloActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSimboloActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JToggleButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel cartelColor;
    private javax.swing.JLabel cartelId;
    private javax.swing.JLabel cartelMasa;
    private javax.swing.JLabel cartelNombre;
    private javax.swing.JLabel cartelSimbolo;
    private javax.swing.JLabel cartelrecNo;
    private javax.swing.JLabel carterlNumero;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblElementos;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMasa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRecNo;
    private javax.swing.JTextField txtSimbolo;
    // End of variables declaration//GEN-END:variables
}
