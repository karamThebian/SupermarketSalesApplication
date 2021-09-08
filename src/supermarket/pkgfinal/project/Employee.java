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
public class Employee extends Person {
    double salary;
        public Employee(String fName, String lName, String dob, String id, String password,double sal) {
        super(fName, lName, dob,id,password);
        setSalary(sal);
    }
 public void setSalary(double startSalary){
 this.salary=startSalary;
 }       
 public double getSalary(){
 return this.salary;
 }       
       @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("Salary: "+this.getSalary());
        
    }     
    public void addNewCars(){
    
    
    
    
    
    
    }
        
        
}
