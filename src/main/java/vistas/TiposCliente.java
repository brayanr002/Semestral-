/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;

/**
 *
 * @author User
 */
public class TiposCliente extends javax.swing.JFrame {

    /**
     * Creates new form TiposCliente
     */
    public TiposCliente() {
        initComponents();
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
        btn_ClienteVIP = new javax.swing.JButton();
        btn_ClienteOcasional = new javax.swing.JButton();
        btn_ClienteFrecuente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_SalirTipoCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_ClienteVIP.setBackground(new java.awt.Color(255, 255, 153));
        btn_ClienteVIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vip_crown_icon_206880.png"))); // NOI18N
        btn_ClienteVIP.setText("CLIENTE VIP");
        btn_ClienteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClienteVIPActionPerformed(evt);
            }
        });

        btn_ClienteOcasional.setBackground(new java.awt.Color(204, 204, 255));
        btn_ClienteOcasional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_person_profile_avatar_icon_190943.png"))); // NOI18N
        btn_ClienteOcasional.setText("CLIENTE OCASIONAL");
        btn_ClienteOcasional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClienteOcasionalActionPerformed(evt);
            }
        });

        btn_ClienteFrecuente.setBackground(new java.awt.Color(255, 153, 153));
        btn_ClienteFrecuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/-card-membership_90253.png"))); // NOI18N
        btn_ClienteFrecuente.setText("CLIENTE FRECUENTE");
        btn_ClienteFrecuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClienteFrecuenteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WiseTransparnte.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 151, 178));
        jLabel3.setText("ELIGA EL TIPO DE CLIENTE A REGISTRAR");

        btn_SalirTipoCliente.setBackground(new java.awt.Color(245, 255, 255));
        btn_SalirTipoCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\mbrilogout_99583.png")); // NOI18N
        btn_SalirTipoCliente.setText("VOLVER");
        btn_SalirTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirTipoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btn_ClienteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btn_ClienteOcasional))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ClienteFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_SalirTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_ClienteOcasional, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(btn_ClienteVIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_SalirTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ClienteFrecuente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ClienteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClienteVIPActionPerformed
        DatosCliente dc = new DatosCliente();
        dc.setVisible(true);
        dc.setLocationRelativeTo(null);
        ClienteVip cv = new ClienteVip();
        cv.setSize(453,206);
        cv.setLocation(0,0);
        dc.variable.removeAll();
        dc.variable.add(cv,BorderLayout.CENTER);
        dc.variable.revalidate();
        dc.variable.repaint();
        
        /*Añadir Columnas*/
        
        dc.TablaCliente = new javax.swing.JTable();

        dc.TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
         {null, null, null, null, null, null, null, null, null}
    },
    new String [] {
        "Nombre", "Cedula", "Genero", "Fecha Nac.", "Correo", "Telefono", "Provincia", "Ciudad", "Corregimiento","Membresia","Credito"
    }
));

    dc.jScrollPane1.setViewportView(dc.TablaCliente);
    }//GEN-LAST:event_btn_ClienteVIPActionPerformed

    private void btn_ClienteOcasionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClienteOcasionalActionPerformed
        DatosCliente dc = new DatosCliente();
        dc.setVisible(true);
        dc.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_ClienteOcasionalActionPerformed

    private void btn_SalirTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirTipoClienteActionPerformed
        this.dispose();
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_SalirTipoClienteActionPerformed

    private void btn_ClienteFrecuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClienteFrecuenteActionPerformed
        DatosCliente dc = new DatosCliente();
        dc.setVisible(true);
        dc.setLocationRelativeTo(null);
        ClienteFrecuente cf = new ClienteFrecuente();
        cf.setSize(453,206);
        cf.setLocation(0,0);
        dc.variable.removeAll();
        dc.variable.add(cf,BorderLayout.CENTER);
        dc.variable.revalidate();
        dc.variable.repaint();
        
                /*Añadir Columnas*/
        
        dc.TablaCliente = new javax.swing.JTable();

        dc.TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null},
    },
    new String [] {
        "Nombre", "Cedula", "Genero", "Fecha Nac.", "Correo", "Telefono", "Provincia", "Ciudad", "Corregimiento","Membresia"
    }
));

    dc.jScrollPane1.setViewportView(dc.TablaCliente);
    }//GEN-LAST:event_btn_ClienteFrecuenteActionPerformed

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
            java.util.logging.Logger.getLogger(TiposCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiposCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiposCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiposCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiposCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ClienteFrecuente;
    private javax.swing.JButton btn_ClienteOcasional;
    private javax.swing.JButton btn_ClienteVIP;
    private javax.swing.JButton btn_SalirTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
