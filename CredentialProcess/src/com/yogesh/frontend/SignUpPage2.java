/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.yogesh.frontend;

/**
 *
 * @author Yogesh
 */
public class SignUpPage2 extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage2
     */
    public SignUpPage2() {
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

        jplContact = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnBackToFirstPage = new javax.swing.JButton();
        btnNextToThirdPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jplContact.setBackground(new java.awt.Color(102, 102, 102));
        jplContact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jplContact.setPreferredSize(new java.awt.Dimension(410, 300));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bank Management System");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mobile No.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email ID");

        btnBackToFirstPage.setBackground(new java.awt.Color(204, 204, 204));
        btnBackToFirstPage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBackToFirstPage.setText("Back");
        btnBackToFirstPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToFirstPageActionPerformed(evt);
            }
        });

        btnNextToThirdPage.setBackground(new java.awt.Color(204, 204, 204));
        btnNextToThirdPage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNextToThirdPage.setText("Next");
        btnNextToThirdPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextToThirdPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplContactLayout = new javax.swing.GroupLayout(jplContact);
        jplContact.setLayout(jplContactLayout);
        jplContactLayout.setHorizontalGroup(
            jplContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplContactLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jplContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jplContactLayout.createSequentialGroup()
                            .addComponent(btnBackToFirstPage)
                            .addGap(18, 18, 18)
                            .addComponent(btnNextToThirdPage)
                            .addGap(15, 15, 15))
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jplContactLayout.setVerticalGroup(
            jplContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplContactLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jplContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackToFirstPage)
                    .addComponent(btnNextToThirdPage))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToFirstPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToFirstPageActionPerformed
        new SignUpPage1().setVisible(true);
    }//GEN-LAST:event_btnBackToFirstPageActionPerformed

    private void btnNextToThirdPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextToThirdPageActionPerformed
        // TODO add your handling code here:
        new SignUpPage3().setVisible(true);
    }//GEN-LAST:event_btnNextToThirdPageActionPerformed

    /**
     * @param args the command line arguments
     */
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToFirstPage;
    private javax.swing.JButton btnNextToThirdPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jplContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNo;
    // End of variables declaration//GEN-END:variables
}
