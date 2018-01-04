package banking_application.pkg1;

import java.util.Scanner;

/**
 *
 * @author Sathira
 */

//takes in the owner information
public class Owner {
    private  String name;
    private String id;
    
    public Owner(){
        
    }
    public Owner(String name, String id){
        this.name = name;
        this.id = id;
    }
    
    public Owner(Owner o){
        this.name = o.name;
        this.id = o.id;
    }
    
    public void input(){
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Owner information ");
        System.out.println("Owner Name");
        this.name = userInput.nextLine();
        System.out.println("Owner Id");
        this.id = userInput.nextLine();
    }
    
    public void print(){
        System.out.println("Owner Information");
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
    }
    
    @Override
    public String toString(){
        return this.name + "("+ this.id + ")";
    }
}