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
public class Client extends Person{
    double balance;
    public Client(String fName, String lName, String dob, String id, String password,double balance) {
        super(fName, lName, dob,id,password);
        setBalance(balance);
    }
public double getBalance(){
return this.balance;
}
public void setBalance(double newBalance)  {
this.balance=newBalance;
}   
public void addBalance(double quantity){
this.balance=this.balance+quantity;
}

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("Balance: "+this.getBalance());
        
    }
}
