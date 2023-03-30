/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;
import java.sql.Timestamp;

/**
 *
 * @author atond
 */
public class Record {
    private int id;
    private String type;
    private String name;
    private int stock;
    private int sold;
    private int sales;
    private int profit;
    private Timestamp insertTimestamp;
    
    public Record(int id, String type, String name, int stock, int sold, int sales, int profit, Timestamp insertTimestamp) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.stock = stock;
        this.sold = sold;
        this.sales = sales;
        this.profit = profit;
        this.insertTimestamp = insertTimestamp;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getStock() {
        return this.stock;
    }
    
    public int getSold() {
        return this.sold;
    }
    
    public int getSales() {
        return this.sales;
    }
    
    public int getProfit() {
        return this.profit;
    }
    
    public Timestamp getInsertTimestamp() {
        return this.insertTimestamp;
    }
}
