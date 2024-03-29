package App;

import java.awt.Color;
import javax.swing.JOptionPane;

public class addRecord extends javax.swing.JFrame {
    
    String a,b;
    
    public addRecord() {
        initComponents();
        cbPPP.setVisible(false);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logBackground = new javax.swing.JPanel();
        logoSide1 = new javax.swing.JPanel();
        logoSide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();
        addRecord = new javax.swing.JButton();
        viewRecord = new javax.swing.JButton();
        logoSide3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoSide5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        printingType = new javax.swing.JLabel();
        productName = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        cbCPP = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbPPP = new javax.swing.JComboBox<>();
        submitBut = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        logBackground.setBackground(new java.awt.Color(246, 246, 246));
        logBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSide1.setBackground(new java.awt.Color(251, 215, 9));
        logoSide1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoSide.setBackground(new java.awt.Color(251, 215, 9));
        logoSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/logo_dashboard.png"))); // NOI18N
        logoSide.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        logoSide1.add(logoSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 80));

        signOut.setBackground(new java.awt.Color(251, 215, 9));
        signOut.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        signOut.setForeground(new java.awt.Color(38, 38, 38));
        signOut.setText("SIGN-OUT");
        signOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signOut.setFocusPainted(false);
        signOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signOutMouseExited(evt);
            }
        });
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        logoSide1.add(signOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, 43));

        addRecord.setBackground(new java.awt.Color(38, 38, 38));
        addRecord.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        addRecord.setForeground(new java.awt.Color(251, 215, 9));
        addRecord.setText("ADD RECORD");
        addRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addRecord.setFocusPainted(false);
        logoSide1.add(addRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, 43));

        viewRecord.setBackground(new java.awt.Color(251, 215, 9));
        viewRecord.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        viewRecord.setForeground(new java.awt.Color(38, 38, 38));
        viewRecord.setText("VIEW RECORD");
        viewRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewRecord.setFocusPainted(false);
        viewRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewRecordMouseExited(evt);
            }
        });
        viewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordActionPerformed(evt);
            }
        });
        logoSide1.add(viewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, 43));

        logBackground.add(logoSide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 950));

        logoSide3.setBackground(new java.awt.Color(38, 38, 38));
        logoSide3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(142, 149, 153));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("You are currently adding records");
        logoSide3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 360, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/waveHand.png"))); // NOI18N
        logoSide3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("Marie's Printing Services Sales Management System");
        logoSide3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        logBackground.add(logoSide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 1170, 100));

        jLabel1.setBackground(new java.awt.Color(142, 149, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Product form");
        logBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/user_profile.png"))); // NOI18N
        logBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 90, 90));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("ADD RECORDS");
        logBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 190, 40));

        logoSide5.setBackground(new java.awt.Color(38, 38, 38));
        logoSide5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logoSide5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1120, 590, 20));

        jPanel1.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logoSide5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 760, 10));

        jPanel2.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logoSide5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 760, 10));

        printingType.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        printingType.setForeground(new java.awt.Color(255, 255, 255));
        printingType.setText("PRINTING TYPE:");
        logoSide5.add(printingType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 230, -1));

        productName.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        productName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coscard/Photocard Printing", "Photo Paper Printing" }));
        productName.setFocusable(false);
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });
        logoSide5.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 430, 30));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        logoSide5.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 70, 30));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRODUCT NAME:");
        logoSide5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 190, -1));

        cbCPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glossy", "Canvas Matte", "Leather", "Glitter", "3D", "Broken Glass Holo", "Holo" }));
        logoSide5.add(cbCPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 130, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STOCKS:");
        logoSide5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        cbPPP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3R Satin", "4R Satin", "4R Glossy", "4R Pearl Holo", "5R Satin", "A4 Glossy", "A4 Satin" }));
        cbPPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPPPActionPerformed(evt);
            }
        });
        logoSide5.add(cbPPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 130, 30));

        submitBut.setBackground(new java.awt.Color(251, 215, 9));
        submitBut.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        submitBut.setForeground(new java.awt.Color(38, 38, 38));
        submitBut.setText("SUBMIT");
        submitBut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        submitBut.setFocusPainted(false);
        submitBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButMouseExited(evt);
            }
        });
        submitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButActionPerformed(evt);
            }
        });
        logoSide5.add(submitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 140, 43));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("FILL-OUT THE FORM");
        logoSide5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/form.png"))); // NOI18N
        logoSide5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/num.png"))); // NOI18N
        logoSide5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/form.png"))); // NOI18N
        logoSide5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/box.png"))); // NOI18N
        logoSide5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 225, -1, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/print.png"))); // NOI18N
        logoSide5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, 40));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("QUANTITY SOLD:");
        logoSide5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/num.png"))); // NOI18N
        logoSide5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 50));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        logoSide5.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, 70, 30));

        logBackground.add(logoSide5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 1170, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void signOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseEntered
        signOut.setBackground(new Color(38,38,38,255));
        signOut.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_signOutMouseEntered

    private void signOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutMouseExited
        signOut.setBackground(new Color(251,215,9,255));
        signOut.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_signOutMouseExited

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        int result = JOptionPane.showConfirmDialog(logBackground,"Are you sure want to sign-out?","", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            this.dispose();
            new login().setVisible(true);
        } 
    }//GEN-LAST:event_signOutActionPerformed

    private void viewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordActionPerformed
        this.dispose();
        new RecordViewing().setVisible(true);
    }//GEN-LAST:event_viewRecordActionPerformed

    private void viewRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordMouseEntered
        viewRecord.setBackground(new Color(38,38,38,255));
        viewRecord.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_viewRecordMouseEntered

    private void viewRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewRecordMouseExited
        viewRecord.setBackground(new Color(251,215,9,255));
        viewRecord.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_viewRecordMouseExited

    private void submitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButActionPerformed
        // TODO add your handling code here:
        b = productName.getSelectedItem().toString();
        a = cbCPP.getSelectedItem().toString();
        
        String soldValue = jSpinner1.getValue().toString();
        String itemStock = jSpinner2.getValue().toString();
        int currentStock = Integer.parseInt(itemStock);
        int currentSold = Integer.parseInt(soldValue);
        RecordManager.getInstance().insertRecordData(b, a, currentSold, currentStock);
    }//GEN-LAST:event_submitButActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        b = productName.getSelectedItem().toString();
        
        
        if("Photo Paper Printing".equals(a)){
            cbPPP.setVisible(true);
            cbCPP.setVisible(false);
        }
        
        if("Coscard/Photocard Printing".equals(a)){
            cbPPP.setVisible(false);
            cbCPP.setVisible(true);
        }
    }//GEN-LAST:event_productNameActionPerformed

    private void submitButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButMouseEntered
        submitBut.setBackground(Color.WHITE);
        submitBut.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_submitButMouseEntered

    private void submitButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButMouseExited
        submitBut.setBackground(new Color(251,215,9,255));
        submitBut.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_submitButMouseExited

    private void cbPPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPPPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPPPActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecord;
    private javax.swing.JComboBox<String> cbCPP;
    private javax.swing.JComboBox<String> cbPPP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JPanel logBackground;
    private javax.swing.JPanel logoSide;
    private javax.swing.JPanel logoSide1;
    private javax.swing.JPanel logoSide3;
    private javax.swing.JPanel logoSide5;
    private javax.swing.JLabel printingType;
    private javax.swing.JComboBox<String> productName;
    private javax.swing.JButton signOut;
    private javax.swing.JButton submitBut;
    private javax.swing.JButton viewRecord;
    // End of variables declaration//GEN-END:variables
}
