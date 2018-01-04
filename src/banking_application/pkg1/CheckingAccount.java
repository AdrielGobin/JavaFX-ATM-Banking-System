package banking_application.pkg1;

import java.util.Scanner;

/**
 *
 * @author Sathira
 */

//creating the Checking Account class
public class CheckingAccount extends Account{
    private float minBalance;
    
    public CheckingAccount(float minBalance, Owner owner, String number, float balance){
        super (owner, number, balance);
        this.minBalance = minBalance;
    }
    
    public CheckingAccount(){
        super ();
        this.minBalance = 0.0f;
    }
    
    public void input(){
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Checking Account information ");
        super.input();
        System.out.println("Enter the minimum balance : ");
        minBalance = userInput.nextFloat();
    }
    
    public void print (){
        System.out.println("Checking Account ");
        System.out.println("-----------------");
        super.print();
        System.out.println("Mininmum balance is : " + minBalance);
    }

    @Override
    public String toString(){
        return "Checking Account ";
    }
    
    public float getMinBalance(){
                
        return minBalance;
    }
} 