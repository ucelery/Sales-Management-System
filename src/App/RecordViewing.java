package App;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import glasspanepopup.DefaultLayoutCallBack;
import glasspanepopup.DefaultOption;
import glasspanepopup.GlassPanePopup;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.header;
import net.miginfocom.layout.ComponentWrapper;
import net.miginfocom.layout.LayoutCallback;
import sample.notification.Notifications;

public class RecordViewing extends javax.swing.JFrame {
    public RecordViewing() {
        GlassPanePopup.install(this);
        
        initComponents(); 
        logoSide.setBackground(new Color(251,215,9,255));
        Border noBorder = new LineBorder(new Color(251,215,9,255));
        
        jLabel33.setVisible(false);
        jLabel47.setVisible(false);
        jLabel32.setVisible(false);
        jLabel35.setVisible(false);
        jLabel34.setVisible(false);
        PPPoverallSales.setVisible(false);
        PPPoverallProfit.setVisible(false);
        PPPtotalSold.setVisible(false);
        
        jLabel40.setVisible(false);
        jLabel48.setVisible(false);
        jLabel39.setVisible(false);
        jLabel41.setVisible(false);
        jLabel42.setVisible(false);
        CPPoverallSales.setVisible(false);
        CPPoverallProfit.setVisible(false);
        CPPtotalSold.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logBackground = new javax.swing.JPanel();
        logoSide1 = new javax.swing.JPanel();
        logoSide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        signOut = new javax.swing.JButton();
        exportCSV = new javax.swing.JButton();
        viewRecord = new javax.swing.JButton();
        addRecord1 = new javax.swing.JButton();
        exportPDF = new javax.swing.JButton();
        logoSide3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoSide6 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        logoSide5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        PPPtotalSold = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        PPPoverallSales = new javax.swing.JLabel();
        PPPoverallProfit = new javax.swing.JLabel();
        PPPview = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        CPPtotalSold = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        CPPoverallSales = new javax.swing.JLabel();
        CPPoverallProfit = new javax.swing.JLabel();
        CPPview = new javax.swing.JButton();
        cmd = new sample.message.Button();

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
        logoSide1.add(signOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 140, 43));

        exportCSV.setBackground(new java.awt.Color(251, 215, 9));
        exportCSV.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        exportCSV.setForeground(new java.awt.Color(38, 38, 38));
        exportCSV.setText("EXPORT TO CSV");
        exportCSV.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exportCSV.setFocusPainted(false);
        exportCSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportCSVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportCSVMouseExited(evt);
            }
        });
        exportCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportCSVActionPerformed(evt);
            }
        });
        logoSide1.add(exportCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, 43));

        viewRecord.setBackground(new java.awt.Color(38, 38, 38));
        viewRecord.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        viewRecord.setForeground(new java.awt.Color(251, 215, 9));
        viewRecord.setText("VIEW RECORD");
        viewRecord.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewRecord.setFocusPainted(false);
        viewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecordActionPerformed(evt);
            }
        });
        logoSide1.add(viewRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, 43));

        addRecord1.setBackground(new java.awt.Color(251, 215, 9));
        addRecord1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        addRecord1.setForeground(new java.awt.Color(38, 38, 38));
        addRecord1.setText("ADD RECORD");
        addRecord1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addRecord1.setFocusPainted(false);
        addRecord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addRecord1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addRecord1MouseExited(evt);
            }
        });
        addRecord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecord1ActionPerformed(evt);
            }
        });
        logoSide1.add(addRecord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, 43));

        exportPDF.setBackground(new java.awt.Color(251, 215, 9));
        exportPDF.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        exportPDF.setForeground(new java.awt.Color(38, 38, 38));
        exportPDF.setText("EXPORT TO PDF");
        exportPDF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        exportPDF.setFocusPainted(false);
        exportPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exportPDFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exportPDFMouseExited(evt);
            }
        });
        exportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDFActionPerformed(evt);
            }
        });
        logoSide1.add(exportPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 140, 43));

        logBackground.add(logoSide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 950));

        logoSide3.setBackground(new java.awt.Color(38, 38, 38));
        logoSide3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(142, 149, 153));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("You are currently viewing the records");
        logoSide3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 360, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/waveHand.png"))); // NOI18N
        logoSide3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Marie's Printing Services Sales Management System");
        logoSide3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 1090, -1));

        logBackground.add(logoSide3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 1170, 100));

        jLabel1.setBackground(new java.awt.Color(142, 149, 153));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Summary");
        logBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/user_profile.png"))); // NOI18N
        logBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 90, 90));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("PRODUCT RECORDS");
        logBackground.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 200, 40));

        logoSide6.setBackground(new java.awt.Color(38, 38, 38));
        logoSide6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        logoSide6.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 590, 10));

        jLabel43.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel43.setForeground(java.awt.Color.white);
        jLabel43.setText("PRINTING PRODUCT DETAILS");
        logoSide6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(251, 215, 9));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        logoSide6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1130, 10));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUCT NAME", "STOCKS", "NO. OF SOLD", "SALES", "PROFIT", "DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table1);

        logoSide6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1130, 160));

        logBackground.add(logoSide6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, 1170, 370));

        logoSide5.setBackground(new java.awt.Color(38, 38, 38));
        logoSide5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(251, 215, 9));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(251, 215, 9));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(38, 38, 38));
        jLabel30.setText("PHOTO PAPER PRINTING");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel31.setBackground(new java.awt.Color(142, 149, 153));
        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Hover for overall details");
        jPanel14.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/info.png"))); // NOI18N
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 40));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 110));

        jPanel15.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 10));

        jLabel32.setBackground(new java.awt.Color(142, 149, 153));
        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(38, 38, 38));
        jLabel32.setText("Total Sold:");
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        jLabel33.setBackground(new java.awt.Color(142, 149, 153));
        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(38, 38, 38));
        jLabel33.setText("Overall Sales:");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        jLabel47.setBackground(new java.awt.Color(142, 149, 153));
        jLabel47.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(38, 38, 38));
        jLabel47.setText("Overall Profit:");
        jPanel13.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 40));

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(38, 38, 38));
        jLabel34.setText("PHP");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        PPPtotalSold.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PPPtotalSold.setForeground(new java.awt.Color(38, 38, 38));
        PPPtotalSold.setText("0");
        jPanel13.add(PPPtotalSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(38, 38, 38));
        jLabel35.setText("PHP");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        PPPoverallSales.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PPPoverallSales.setForeground(new java.awt.Color(38, 38, 38));
        PPPoverallSales.setText("0.00");
        jPanel13.add(PPPoverallSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        PPPoverallProfit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        PPPoverallProfit.setForeground(new java.awt.Color(38, 38, 38));
        PPPoverallProfit.setText("0.00");
        jPanel13.add(PPPoverallProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        PPPview.setBackground(new java.awt.Color(38, 38, 38));
        PPPview.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        PPPview.setForeground(new java.awt.Color(255, 255, 255));
        PPPview.setText("SPECIFIC DETAILS");
        PPPview.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PPPview.setFocusPainted(false);
        PPPview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PPPviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PPPviewMouseExited(evt);
            }
        });
        PPPview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPPviewActionPerformed(evt);
            }
        });
        jPanel13.add(PPPview, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 70));

        logoSide5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 490, 270));

        jPanel16.setBackground(new java.awt.Color(251, 215, 9));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(251, 215, 9));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(38, 38, 38));
        jLabel36.setText("COSCARD/PHOTOCARD");
        jPanel17.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, -1));

        jLabel37.setBackground(new java.awt.Color(142, 149, 153));
        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Hover for overall details");
        jPanel17.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/Images/info.png"))); // NOI18N
        jPanel17.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 30, 40));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 110));

        jPanel18.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 10));

        jLabel39.setBackground(new java.awt.Color(142, 149, 153));
        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(38, 38, 38));
        jLabel39.setText("Total Sold:");
        jPanel16.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        jLabel40.setBackground(new java.awt.Color(142, 149, 153));
        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(38, 38, 38));
        jLabel40.setText("Overall Sales:");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        jLabel48.setBackground(new java.awt.Color(142, 149, 153));
        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(38, 38, 38));
        jLabel48.setText("Overall Profit:");
        jPanel16.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 40));

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(38, 38, 38));
        jLabel41.setText("PHP");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        CPPtotalSold.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CPPtotalSold.setForeground(new java.awt.Color(38, 38, 38));
        CPPtotalSold.setText("0");
        jPanel16.add(CPPtotalSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(38, 38, 38));
        jLabel42.setText("PHP");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        CPPoverallSales.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CPPoverallSales.setForeground(new java.awt.Color(38, 38, 38));
        CPPoverallSales.setText("0.00");
        jPanel16.add(CPPoverallSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        CPPoverallProfit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CPPoverallProfit.setForeground(new java.awt.Color(38, 38, 38));
        CPPoverallProfit.setText("0.00");
        jPanel16.add(CPPoverallProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        CPPview.setBackground(new java.awt.Color(38, 38, 38));
        CPPview.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        CPPview.setForeground(new java.awt.Color(255, 255, 255));
        CPPview.setText("SPECIFIC DETAILS");
        CPPview.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        CPPview.setFocusPainted(false);
        CPPview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CPPviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CPPviewMouseExited(evt);
            }
        });
        CPPview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPPviewActionPerformed(evt);
            }
        });
        jPanel16.add(CPPview, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 180, 70));

        logoSide5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 460, 270));

        logBackground.add(logoSide5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 1170, 380));

        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/sample/notification/noti.png"))); // NOI18N
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActionPerformed(evt);
            }
        });
        logBackground.add(cmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 30, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
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

    private void exportCSVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportCSVMouseEntered
        exportCSV.setBackground(new Color(38,38,38,255));
        exportCSV.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_exportCSVMouseEntered

    private void exportCSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportCSVMouseExited
        exportCSV.setBackground(new Color(251,215,9,255));
        exportCSV.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_exportCSVMouseExited

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

    private void PPPviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPPviewActionPerformed
        jLabel43.setText("PHOTO PAPER PRINTING");
        populateTable("Photo Paper Printing");
    }//GEN-LAST:event_PPPviewActionPerformed

    private void PPPviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPPviewMouseExited
        PPPview.setBackground(new Color(38,38,38,255));
        PPPview.setForeground(Color.WHITE);
    }//GEN-LAST:event_PPPviewMouseExited

    private void PPPviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PPPviewMouseEntered
        PPPview.setBackground(Color.WHITE);
        PPPview.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_PPPviewMouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jLabel33.setVisible(false);
        jLabel47.setVisible(false);
        jLabel32.setVisible(false);
        jLabel35.setVisible(false);
        jLabel34.setVisible(false);
        PPPoverallSales.setVisible(false);
        PPPoverallProfit.setVisible(false);
        PPPtotalSold.setVisible(false);
        PPPview.setVisible(true);
        
    }//GEN-LAST:event_jPanel14MouseExited

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        jLabel33.setVisible(true);
        jLabel47.setVisible(true);
        jLabel32.setVisible(true);
        jLabel35.setVisible(true);
        jLabel34.setVisible(true);
        PPPoverallSales.setVisible(true);
        PPPoverallProfit.setVisible(true);
        PPPtotalSold.setVisible(true);
        PPPview.setVisible(false);
        
        String _productName = "Photo Paper Printing";

        RecordManager rmInstance = RecordManager.getInstance();
        
        //display records
        String sold = String.valueOf(rmInstance.getTotalSold(_productName));
        String sales = String.valueOf(rmInstance.getTotalSales(_productName));
        String profit = String.valueOf(rmInstance.getTotalProfit(_productName));

        PPPoverallSales.setText(sales + ".00");
        PPPoverallProfit.setText(profit + ".00");
        PPPtotalSold.setText(sold);
    }//GEN-LAST:event_jPanel14MouseEntered
    
    private void CPPviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPPviewActionPerformed
        // TODO add your handling code here:
        jLabel43.setText("COSCARD/PHOTOCARD PRINTING");
        
        populateTable("Coscard/Photocard Printing");
    }//GEN-LAST:event_CPPviewActionPerformed

    private void populateTable(String productType) {
        DefaultTableModel tableModel = (DefaultTableModel)table1.getModel();
        
        // Clear table
        tableModel.setRowCount(0);
        for (Record record : RecordManager.getInstance().getRecordsData()) {
            if (!record.getType().equals(productType)) continue;
            
            System.out.println();
            Date date = new Date(record.getInsertTimestamp().getTime());
            DateFormat f1 = new SimpleDateFormat("yyyy/MM/dd");
            String dateStr = f1.format(date);
            tableModel.addRow(new String[]{ String.valueOf(record.getID()), record.getName(), String.valueOf(record.getStock()), String.valueOf(record.getSold()), String.valueOf(record.getSales()), String.valueOf(record.getProfit()), String.valueOf(dateStr)});
        }
    }
    
    private void CPPviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPPviewMouseExited
        CPPview.setBackground(new Color(38,38,38,255));
        CPPview.setForeground(Color.WHITE);
    }//GEN-LAST:event_CPPviewMouseExited

    private void CPPviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CPPviewMouseEntered
        CPPview.setBackground(Color.WHITE);
        CPPview.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_CPPviewMouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        jLabel40.setVisible(false);
        jLabel48.setVisible(false);
        jLabel39.setVisible(false);
        jLabel41.setVisible(false);
        jLabel42.setVisible(false);
        CPPoverallSales.setVisible(false);
        CPPoverallProfit.setVisible(false);
        CPPtotalSold.setVisible(false);
        CPPview.setVisible(true);
        
    }//GEN-LAST:event_jPanel17MouseExited

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        jLabel40.setVisible(true);
        jLabel48.setVisible(true);
        jLabel39.setVisible(true);
        jLabel41.setVisible(true);
        jLabel42.setVisible(true);
        CPPoverallSales.setVisible(true);
        CPPoverallProfit.setVisible(true);
        CPPtotalSold.setVisible(true);
        CPPview.setVisible(false);
        
        RecordManager rmInstance = RecordManager.getInstance();
        
        String _productName = "Coscard/Photocard Printing";
        //display records
        String sold = String.valueOf(rmInstance.getTotalSold(_productName));
        String sales = String.valueOf(rmInstance.getTotalSales(_productName));
        String profit = String.valueOf(rmInstance.getTotalProfit(_productName));

        CPPoverallSales.setText(sales + ".00");
        CPPoverallProfit.setText(profit + ".00");
        CPPtotalSold.setText(sold);
    }//GEN-LAST:event_jPanel17MouseEntered

    private void exportCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportCSVActionPerformed
                    //JFILE Chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("CSV Files", ".csv"));
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            
                    // If the selected file doesn't have a ".csv" extension, add it
                    if(!fileToSave.getName().toLowerCase().endsWith(".csv")) {
                        fileToSave = new File(fileToSave.getParentFile(), fileToSave.getName() + ".csv");
                    }
            
            try {
                FileWriter fw = new FileWriter(fileToSave);
                BufferedWriter bw = new BufferedWriter(fw);

            // Write column names to file
            for (int i = 0; i < table1.getColumnCount(); i++) {
                bw.write(table1.getColumnName(i) + ",");
            }
                bw.newLine();
            
            // Write table data to file
            for (int i = 0; i <table1.getRowCount(); i++) {
                for (int j = 0; j < table1.getColumnCount(); j++) {
                    bw.write(table1.getValueAt(i, j).toString()+",");
                }
                bw.newLine();
            }             
            JOptionPane.showMessageDialog(this, "SUCCESSFULLY EXPORTED", "DATA",JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "ERROR", "ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
        } 
    }//GEN-LAST:event_exportCSVActionPerformed

    private void viewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewRecordActionPerformed

    private void cmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActionPerformed
        GlassPanePopup.showPopup(new Notifications(), new DefaultOption() {
            @Override
            public float opacity() {
                return 0;
            }

            @Override
            public LayoutCallback getLayoutCallBack(Component parent) {
                return new DefaultLayoutCallBack(parent) {
                    @Override
                    public void correctBounds(ComponentWrapper cw) {
                        if (parent.isVisible()) {
                            Point pl = parent.getLocationOnScreen();
                            Point bl = cmd.getLocationOnScreen();
                            int x = bl.x - pl.x;
                            int y = bl.y - pl.y;
                            y += (1f - getAnimate()) * 10f;
                            cw.setBounds(x - cw.getWidth() + cmd.getWidth(), y + cmd.getHeight(), cw.getWidth(), cw.getHeight());
                        } else {
                            super.correctBounds(cw);
                        }
                    }
                };
            }

            @Override
            public String getLayout(Component parent, float animate) {
                return null;
            }
        });
    }//GEN-LAST:event_cmdActionPerformed

    private void addRecord1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRecord1MouseEntered
        // TODO add your handling code here:
        addRecord1.setBackground(new Color(38,38,38,255));
        addRecord1.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_addRecord1MouseEntered

    private void addRecord1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRecord1MouseExited
        // TODO add your handling code here:
        addRecord1.setBackground(new Color(251,215,9,255));
        addRecord1.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_addRecord1MouseExited

    private void addRecord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecord1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new addRecord().setVisible(true);
    }//GEN-LAST:event_addRecord1ActionPerformed

    private void exportPDFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPDFMouseEntered
        // TODO add your handling code here:
        exportPDF.setBackground(new Color(38,38,38,255));
        exportPDF.setForeground(new Color(251,215,9,255));
    }//GEN-LAST:event_exportPDFMouseEntered

    private void exportPDFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportPDFMouseExited
        // TODO add your handling code here:
        exportPDF.setBackground(new Color(251,215,9,255));
        exportPDF.setForeground(new Color(38,38,38,255));
    }//GEN-LAST:event_exportPDFMouseExited

    private void exportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDFActionPerformed
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Files", ".pdf"));
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
            File fileToSave = fileChooser.getSelectedFile();
            
                    // If the selected file doesn't have a ".csv" extension, add it
                    if(!fileToSave.getName().toLowerCase().endsWith(".pdf")) {
                        fileToSave = new File(fileToSave.getParentFile(), fileToSave.getName() + ".pdf");
                    }

        
        Document doc = new Document();
        doc.setPageSize(PageSize.LETTER.rotate());

        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(fileToSave));
            
            doc.open();
            
            PdfPTable tbl = new PdfPTable(table1.getColumnCount());
            
            //Add Headers from Table
            for (int i = 0; i < table1.getColumnCount(); i++) {
                tbl.addCell(table1.getColumnName(i));
            }
 
            //Add table data from table
            
            for (int i = 0; i <table1.getRowCount(); i++) {
                for (int p = 0; p < table1.getColumnCount(); p++) {
                    tbl.addCell(table1.getValueAt(i, p).toString());
                }
            }
            doc.add(tbl);
    
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordViewing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(RecordViewing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
        }
    }//GEN-LAST:event_exportPDFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordViewing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPPoverallProfit;
    private javax.swing.JLabel CPPoverallSales;
    private javax.swing.JLabel CPPtotalSold;
    private javax.swing.JButton CPPview;
    private javax.swing.JLabel PPPoverallProfit;
    private javax.swing.JLabel PPPoverallSales;
    private javax.swing.JLabel PPPtotalSold;
    private javax.swing.JButton PPPview;
    private javax.swing.JButton addRecord1;
    private sample.message.Button cmd;
    private javax.swing.JButton exportCSV;
    private javax.swing.JButton exportPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel logBackground;
    private javax.swing.JPanel logoSide;
    private javax.swing.JPanel logoSide1;
    private javax.swing.JPanel logoSide3;
    private javax.swing.JPanel logoSide5;
    private javax.swing.JPanel logoSide6;
    private javax.swing.JButton signOut;
    private javax.swing.JTable table1;
    private javax.swing.JButton viewRecord;
    // End of variables declaration//GEN-END:variables
}
