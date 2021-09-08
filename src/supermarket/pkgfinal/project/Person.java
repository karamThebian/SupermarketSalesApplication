/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.pkgfinal.project;



/**
 *
 * @author macuser
 */
public class Person {
    final int x = 10;
    private String firstName; // Person First Name
    private String lastName; // Person Last Name
    private String dateOfBirth; // Person Date of birthday
    private String id;
    private String password;
    public Person(String fName, String lName, String dob,String id,String password) {
        this.setFirstName(fName);
        this.setLastName(lName);
        this.setDobOfBith(dob);
        this.setId(id);
        this.setPassword(password);
    }
    
    public String getFirstName() {
        return this.firstName;  
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
        public String getId() {
        return this.id;
    }
        public String getPassword() {
        return this.password;
    }
    public void setFirstName(String fName) {
        this.firstName = fName;
    }
        public void setId(String i) {
        this.id = i;
    }
            public void setPassword(String pass) {
        this.password = pass;
    }
    public void setLastName(String lName) {
        this.lastName = lName;
    }
    
    public void setDobOfBith(String dob) {
        this.dateOfBirth = dob;
    }
    
    
    
    

    
    
    
    public void showinfo() {
        System.out.println("Id: "+this.getId() );
        System.out.println("First Name: "+this.getFirstName() );
        System.out.println("Last Name: "+this.getLastName());
        System.out.println("Date Of Birth: "+this.getDateOfBirth());
    }
}