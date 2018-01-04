package banking_application.pkg1;

import java.util.Scanner;

/**
 *
 * @author Sathira
 */

//creating the savings account class
public class SavingsAccount extends Account{

    private float interestRate;
    
    public SavingsAccount(float interestRate, Owner owner, String number, float balance){
        super (owner, number, balance);
        this.interestRate = interestRate;
    }
    
    public SavingsAccount(){
        super();
        this.interestRate = 0.0f;
    }
    
    public void input(){
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Savings Account information ");
        super.input();
        System.out.println("Enter the interest rate : ");
        interestRate = userInput.nextFloat();
    }
    
    public void print (){
        System.out.println("Savings Account ");
        System.out.println("-----------------");
        super.print();
        System.out.println("Interest rate is : " + interestRate);
    }
    
    @Override
    public String toString(){
        return "Saving Account ";
    }
    
    public float getBalance(){
        float interest;
        //calculating the interest rate
        interest = balance * interestRate /100 + balance;
        
        return interest;
    }
} 