/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.pkgfinal.project;

/**
 *
 * @author user
 */
public class Item {
    private int ExpiryDate;
    private String ItemName;
    private double Price;
    private String Status;
    public Item(int ExpiryDate, String ItemName,  double Price)
    {
        
        this.setExpiryDate(ExpiryDate);
        this.setItemName(ItemName);
        this.setStatus("Available");
        this.setPrice(Price);
        
        
    }
    
     public int getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(int ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }
    
     public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }
    
     public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
     public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public void showinfo()
     {
         System.out.println("******************************************************************************");
         System.out.println("Item Name:"+this.ItemName);
         System.out.println("ExpiryDate:"+getExpiryDate());
         System.out.println("The Item is:"+this.Status);
         System.out.println("The price is:"+this.Price+"$");
         System.out.println("******************************************************************************");
     }
}

