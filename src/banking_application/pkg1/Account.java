package banking_application.pkg1;

import java.util.Scanner;

/**
 * @author Sathira
 */


//takes in the account information 
public class Account {
	
    private Owner owner;
    private String number;
    public float balance;

    public Account(){
    	
        this.owner = new Owner();
        this.number = number;
        this.balance = balance;
        
    }
    
    public Account(Owner owner, String number, float balance){
    	
        this.owner = new Owner(owner);
        this.number = number;
        this.balance = balance;
        
    }
    
    public Account(Account acc){
    	
        this.owner = new Owner(acc.owner);
        this.number = acc.number;
        this.balance = acc.balance;
        
    }
    
    @Override
    public String toString(){
         String str;
         str = "Account : " + this.owner;
         
         return str;
    }
    
    public void input(){
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Account information ");
        this.owner.input();
        System.out.println("Account Number : ");
        this.number = userInput.nextLine();
        System.out.println("Account starting balance : ");
        this.balance = userInput.nextFloat();
    }
    
    public void print (){
        System.out.println("Account Number " + this.number);
        System.out.println("Account owner " + this.owner);
        System.out.println("Account Balance " + this.balance);
    }
    
    public void withdraw (){
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter ammount to withdraw ");
        float ammount = userInput.nextFloat();
        
        if (ammount >= 0 && this.balance > ammount){
            this.balance -= ammount;
        }else{
            balance = balance - 5;;
        }
   }  
    
    public void deposit(){
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Enter ammount to deposit ");
        float ammount = userInput.nextFloat();
        
        if(ammount >= 0){
            this.balance += ammount;
        }else{
            System.out.println("Invalid Ammount");
        }
    }

        float getBalance(){
            return this.balance;
        }
        
        public String getNumber(){
            
            return number;
        } 
}    