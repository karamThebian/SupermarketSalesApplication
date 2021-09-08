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


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaytho
 */
public class SupermarketFinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        int availableIdE=1;
        int availableIdC=1;
        ArrayList<Employee> myEmployees=new ArrayList();
        ArrayList<Item> myItems = new ArrayList();
        ArrayList<Client> myClients = new ArrayList();
        do{
        System.out.println("Welcome to KKAM Super Market");

        Scanner myscanner= new Scanner(System.in);
        
        System.out.println("1.Employee");
        System.out.println("2.Client");
        String id;
        String password;
        
        choice=myscanner.nextInt();
        switch (choice){
            case 1: 
        //login or register
                do{
        System.out.println("Welcome Employee");
                System.out.println("1.Login");
                System.out.println("2.Register");
                System.out.println("3.Return to previous menu");
          choice=myscanner.nextInt();
                switch (choice){
                    //login
                    case 1: System.out.println("Enter id: ");
                            id=myscanner.nextLine();
                            id=myscanner.nextLine();
                            
                            System.out.println("Enter password: ");
                            password=myscanner.nextLine();
                            
                            int incorrect=1;           
                                for(int i=0; i<myEmployees.size(); i++) {
            
            if(myEmployees.get(i).getId().equalsIgnoreCase(id) && myEmployees.get(i).getPassword().equalsIgnoreCase(password)){
                do{ incorrect=0;
            
            System.out.println("Welome Mr."+myEmployees.get(i).getFirstName()+" "+myEmployees.get(i).getLastName());
            System.out.println("Would You like to:");
            System.out.println("1.Show Info");
            System.out.println("2.Add new Items");
            System.out.println("3.Print All Items");
            System.out.println("4.Exit");
            choice=myscanner.nextInt();
           switch (choice){
               case 1: myEmployees.get(i).showinfo(); 
                   break;
               case 2: int ExpiryDate;
        String ItemName ,Status; 
        double Price;
         String shouldIContinue;
        Item v1;
        
        System.out.println("Should we start? Yes or No");
        shouldIContinue = myscanner.nextLine();
        shouldIContinue = myscanner.nextLine();
        
        while(shouldIContinue.equalsIgnoreCase("yes")) {
            System.out.println("Enter the ExpiryDate");
            ExpiryDate = myscanner.nextInt();

            
            System.out.println("Enter the Item Name");
            myscanner.nextLine();
            ItemName = myscanner.nextLine();


            
             
            
            System.out.println("Enter Price");
            Price = myscanner.nextDouble();
            
            
            
            v1 = new Item(ExpiryDate, ItemName,  Price);
            myItems.add(v1);
            
            System.out.println("Add more? Yes or No");
            myscanner.nextLine();
            shouldIContinue = myscanner.nextLine();
            
        }
               break;
               case 3:
                  for(int j=0; j<myItems.size(); j++) {
            
            myItems.get(j).showinfo();
        
        } 
               break;
               case 4: break;
               default: System.out.println("Invalid Choice");
                   
                   
                   
                   
                   
           }
                }while(choice!=4);
            }
            
        
        }
                                if(incorrect ==1) {System.out.println("Incorrect id or Password");}
          break;
                    case 2: //register
            System.out.println("your id is:"+availableIdE);
            id=Integer.toString(availableIdE);
            availableIdE++;
            String fName,lName,dob,pass;
            double sal;
            Employee e1;
            System.out.println("Please enter the following Credentials:");
            
            System.out.println("First Name:");
            myscanner.nextLine();
            fName=myscanner.nextLine();
            System.out.println("Last Name:");
            lName=myscanner.nextLine();
            System.out.println("Date of Birth:");
            dob=myscanner.nextLine();
            System.out.println("Password:");
            pass=myscanner.nextLine();
            System.out.println("Salary");
            sal=myscanner.nextDouble();                
e1 = new Employee(fName, lName, dob, id, pass, sal);
            myEmployees.add(e1);
            e1.showinfo();
            break;
                    case 3: break;
                    default: System.out.println("Invalid Choice");
                        
                    
                } 
        }while(choice!=3);
                break;
            case 2:
                
                
                
                
                
                
                
                
                do{
        System.out.println("Welcome Client");
                System.out.println("1.Login");
                System.out.println("2.Register");
                System.out.println("3.Return to Previous Menu");
          choice=myscanner.nextInt();
                switch (choice){
                    //login
                    case 1: System.out.println("Enter id: ");
                            id=myscanner.nextLine();
                            id=myscanner.nextLine();
                            
                            System.out.println("Enter password: ");
                            password=myscanner.nextLine();
                            
                            int incorrect=1;           
                                for(int i=0; i<myClients.size(); i++) {
            
            if(myClients.get(i).getId().equalsIgnoreCase(id) && myClients.get(i).getPassword().equalsIgnoreCase(password)){
                do{ incorrect=0;
            
            System.out.println("Welome Mr."+myClients.get(i).getFirstName()+" "+myClients.get(i).getLastName());
            System.out.println("Would You like to:");
            System.out.println("1.Show Info");
            System.out.println("2.Print All Items");
            System.out.println("3.Buy an Item");
            System.out.println("4.Exit");
            choice=myscanner.nextInt();
           switch (choice){
               case 1: myClients.get(i).showinfo(); 
                   break;
               
               case 2:
                  for(int j=0; j<myItems.size(); j++) {
            
            myItems.get(j).showinfo();
        
        } 
               break;
               case 3:
                   
                   System.out.println("Enter the Name of the Item You would Like to Purchase:");
                   String itemName;
                   itemName=myscanner.nextLine();
                   itemName=myscanner.nextLine();
                   int itemAvailable=0;
                   for(int j=0; j<myItems.size(); j++) {
            if(myItems.get(j).getItemName().equalsIgnoreCase(itemName) ){
            itemAvailable=1;
            if(myItems.get(j).getStatus().equalsIgnoreCase("Available")){
                if(  myClients.get(i).getBalance()>= myItems.get(j).getPrice()){
                System.out.println("Congratulations, you have bought this item successfuly");
                myClients.get(i).setBalance(myClients.get(i).getBalance()-myItems.get(j).getPrice());
                myItems.get(j).setStatus("Out of Stock");
                }
                else{
                System.out.println("Sorry, your balance is less than the price of the item your intending on buying");
                }
            }
            else{
            System.out.println("The item you are searching for is not available at the moment, please try again later or ask an employee to aid you");
            }
            }
            
        
        } 
             if(itemAvailable==0){
             System.out.println("The Name you entered doesnt match any item available here.");}      
                   
                   
                   
                   break;
                   case 4: break;
               default: System.out.println("Invalid Choice");
                   
                   
                   
                   
                   
           }
                }while(choice!=3);
            }
            
        
        }
                                if(incorrect ==1) {System.out.println("Incorrect id or Password");}
          break;
                    case 2: //register
            System.out.println("your id is:"+availableIdC);
            id=Integer.toString(availableIdC);
            availableIdC++;
            String fName,lName,dob,pass;
            double bal;
            Client c1;
            System.out.println("Please enter the following Credentials:");
            
            System.out.println("First Name:");
            myscanner.nextLine();
            fName=myscanner.nextLine();
            System.out.println("Last Name:");
            lName=myscanner.nextLine();
            System.out.println("Date of Birth:");
            dob=myscanner.nextLine();
            System.out.println("Password:");
            pass=myscanner.nextLine();
            System.out.println("Balance");
            bal=myscanner.nextDouble();                
c1 = new Client(fName, lName, dob, id, pass, bal);
            myClients.add(c1);
            c1.showinfo();
            break;
                    case 3:break;
                    default: System.out.println("Invalid Choice");
                        
                    
                } 
        }while(choice!=3);
                
                
                
                
                
                
                
                
        }
        
        
        }while(choice!=-1);
        
        
        
        
        
        
        
        
        
    
    

        
        
        
        
        
    }
    
}




