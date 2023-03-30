/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;

/**
 *
 * @author atond
 */
public class RecordManager {
    private static RecordManager _Instance = null;
    private static ArrayList<Record> records = null;
    
    private final String dbUser = "Napphy";
    private final String dbPassword = "Sep2021102596";
    private final String dbURL ="jdbc:mysql://cs155-project.c4znnhx9inbw.ap-southeast-2.rds.amazonaws.com:3306/cs155?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private Connection connect = null;
    
    private static final int THREAD_POOL_SIZE = 5;
    ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    
    public RecordManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        getRecordsData();
    }
    
    public void insertRecordData(String productType, String productName, int currSold, int currStock) {
        executorService.execute(() -> {
            int currentSales = currSold * 18;
            int currentProfit = currentSales * 8;

            try {
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                String query =  "INSERT INTO inventory (productType, productName, stock, sold, sales, profit, insertTimestamp) " + 
                                "VALUES ('" + productType + "', '" + productName + "', '" + currStock + "', '" + currSold + "', '" + currentSales + "', '" + currentProfit + "', '" + timestamp + "')";

                PreparedStatement addSalesRecord = connect.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                addSalesRecord.execute();         
                
                // Add newly inserted data to cache
                ResultSet rs = addSalesRecord.getGeneratedKeys();
                
                if (rs.next()) {
                    records.add(new Record(rs.getInt(1), productType, productName, currStock, currSold, currentSales, currentProfit, timestamp));
                }
                
                JOptionPane.showMessageDialog(null, "Success.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
                System.out.println(e);
            }
        });
    }
    
    public ArrayList<Record> getRecordsData() {
        if (records == null) {
            records = new ArrayList();
            try {
                String inventoryQuery = "SELECT * FROM inventory";
                PreparedStatement getRecords = connect.prepareStatement(inventoryQuery);
                ResultSet rs = getRecords.executeQuery();
                while (rs.next()) {
                    Record rec = new Record(rs.getInt("productID"), rs.getString("productType"), rs.getString("productName"), rs.getInt("stock"), rs.getInt("sold"), rs.getInt("sales"), rs.getInt("profit"), rs.getTimestamp("insertTimestamp"));
                    records.add(rec);
                }
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }   
        }
        return records;
    }
    
    public int getTotalSold(String productName) {
        int totalSold = 0;
        //display records
        for (Record rec : records) 
            if (productName.equals(String.valueOf(rec.getName())))
                totalSold += rec.getSold();
        
        return totalSold;
    }
    
    public int getTotalSales(String productName) {
        int totalSales = 0;
        //display records
        for (Record rec : records)
            if (productName.equals(String.valueOf(rec.getName()))) 
                totalSales += rec.getSales();
         
        return totalSales;
    }
    
    public int getTotalProfit(String productName) {
        int totalProfit = 0;
        //display records
        for (Record rec : records)
            if (productName.equals(String.valueOf(rec.getName()))) 
                totalProfit += rec.getProfit();
         
        return totalProfit;
    }
    
    public static RecordManager getInstance() {
        if (_Instance == null) {
            _Instance = new RecordManager();
        }
        
        return _Instance;
    }

    void upsertAddRecordData(String a, String b, int currentSold, int currentStock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
