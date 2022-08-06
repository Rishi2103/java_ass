/*Design a class named Account that contains:
•A private int data field name did for the account (default 0).
•A private double data field named balance for the account (default 500₹).
•A  private  double  data  field  named  annual Interest Rate  that  stores 
 the  current interest rate (default 7%). 
 Assume all accounts have the same interest rate.
•A  private  Date  data  field  named  date Created  that  stores  the  date 
 when  the account was created.
•A no-arg constructor that creates a default account.
•A constructor that creates an account with the specified id and initial balance.
•The accessor and mutator methods for id, balance, and annual Interest Rate.
•The accessor method for date Created.
•A method named getMonthlyInterestRate() that returns the monthly interest rate.
•A method named getMonthlyInterest() that returns the monthly interest.
•A method named withdraw that withdraws a specified amount from the account.
•A method named deposit that deposits a specified amount to the account.

Prepared by 21ce015 Rishikesh Chaudhari   */

import java.util.Scanner;
class Account {
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 7;
    private java.util.Date dateCreated;
    Account(){
        dateCreated = new java.util.Date();
     }
    Account(int id, double balance){
        this.balance = balance;
        this.id = id;
        dateCreated = new java.util.Date();
    }
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int newId){
        id = newId;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12;
    }
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public void getAccountDetails(){
        System.out.println("id : " + getId());
        System.out.println("Balance : " + getBalance());
        System.out.println("Annual Interest Rate : " + getAnnualInterestRate());
        System.out.println("Monthly Interest : " + getMonthlyInterest());
        System.out.println("This account was created on : " + getDateCreated());
    }
}

public class P2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Id : ");
        int id = in.nextInt();
        System.out.print("Enter your balance : ");
        double balance = in.nextDouble();
        System.out.println("Enter the interest rate : ");
        double interest = in.nextDouble();
        System.out.println("Enter the amount to be withdrawn : ");
        double withdrawAmount = in.nextDouble();
        System.out.println("Enter the deposit amount : ");
        double depositAmount = in.nextDouble();
        Account a = new Account(id , balance);
        a.setAnnualInterestRate(interest);
        a.withdraw(withdrawAmount);
        a.deposit(depositAmount);
        a.getAccountDetails();
    }
}
