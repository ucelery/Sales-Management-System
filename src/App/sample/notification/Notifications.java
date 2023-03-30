package sample.notification;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import sample.scroll.ModernScrollBarUI;

import java.text.SimpleDateFormat;  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;  
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Notifications extends javax.swing.JPanel {

    /**
     * Creates new form Notifications
     */
    int i=0;
    int j = 10;
    Item[] array;
    
    ArrayList<Item> listOfNotifs;
    JPanel[] arr = new JPanel[7];
    
    public Notifications() {
        initComponents();
        setOpaque(false);
        JScrollBar sb = scroll.getVerticalScrollBar();
        sb.setOpaque(false);
        sb.setForeground(new Color(251,215,9)); //color of scrolling bar
        sb.setPreferredSize(new Dimension(9, 9));
        sb.setUI(new ModernScrollBarUI());
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        panel.setLayout(new MigLayout("inset 0, fillx, wrap", "[fill]")); //location ng panel
        
        // Load data
        loadRecords();
    }
    
    
    public void loadRecords() {
         try
            {
                String dbUser = "Napphy";
                String dbPassword = "Sep2021102596";
                String dbURL ="jdbc:mysql://cs155-project.c4znnhx9inbw.ap-southeast-2.rds.amazonaws.com:3306/cs155?zeroDateTimeBehavior=CONVERT_TO_NULL";

                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connect = DriverManager.getConnection(dbURL, dbUser, dbPassword);
                String viewPPPrecords = "SELECT productName,stock FROM inventory";
                PreparedStatement getPPP = connect.prepareStatement(viewPPPrecords);
                ResultSet getPPPrecords = getPPP.executeQuery();
                array = new Item[j];
            
                getPPPrecords.last();
                int size = getPPPrecords.getRow();
                
                System.out.println(size);
                
                //display records
                while(getPPPrecords.next())
                {
                    String pName = getPPPrecords.getString("productName");
                    int stock = getPPPrecords.getInt("stock");
                    
                    // Check stock, if less than 11 add notif for that product
                    if(stock <= 10){
                        array[i] = new Item(pName, "is runnning low in stocks. " + stock + " left. Please Review.");
                        i++;
                    }
                }
                
                // Update Notifs
                for(int x = 0; x < i; x++) {
                    panel.add(array[x]);
                }
                /*       
                Component[] componentList = panel.getComponents();
                int b = 0;
                for(Component c : componentList)
                {
                    if(array[b].getLbName().getText() == "5R Satin")
                    {
                        panel.remove(c);
                    }
                    b++;
                }
                panel.revalidate();
                panel.repaint();
                */
            }

                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, e);
                    }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        int header = 10;
        AffineTransform tran = new AffineTransform();
        tran.translate(getWidth() - 25, 5);
        tran.rotate(Math.toRadians(45));
        Path2D p = new Path2D.Double(new RoundRectangle2D.Double(0, 0, 20, 20, 5, 5), tran);
        Area area = new Area(p);
        area.add(new Area(new RoundRectangle2D.Double(0, header, getWidth(), getHeight() - header, 10, 10)));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(238, 245, 249));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 10, 10, 10));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(117, 117, 117));
        jLabel1.setText("Notifications");

        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        scroll.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
