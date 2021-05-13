package com.dinesh;
import java.util.Scanner;
public class bank {
    Scanner input = new Scanner(System.in);
    String HolderName,Type;
    int amt;
    void filldetails(){
        System.out.println("Welcome to bank");
    }
}
class savings extends bank{
    void filldetails(){
        System.out.println("Enter savings account holder name:");
        HolderName=input.nextLine();
        System.out.println("Account holder name:"+HolderName);
        super.filldetails();
    }
    void FixedDeposits(){
        System.out.println("Enter Fixed deposit amount:");
        amt=input.nextInt();
        if(amt>250000 && amt<500000){
            System.out.println("Account belongs to Primary Fixed Deposit");
            System.out.println("Total Amount"+amt);
        }
        else if(amt>500001){
            System.out.println("Account belongs to Secondary Fixed Deposit");
            System.out.println("Total Amount"+amt);
        }
        else {
            System.out.println("Not Eligible for Fixed Deposit");
            System.out.println("Total Amount"+amt);
        }
    }
}
class current extends bank{
    void filldetails(){
        System.out.println("Enter current account holder name:");
        HolderName=input.nextLine();
        System.out.println("Account holder name:"+HolderName);
        super.filldetails();
    }
    void CashCredit(){
        super.filldetails();
        System.out.println("Enter Amount which to be deposited");
        amt= input.nextInt();
        System.out.println("Total Amount"+amt);
    }
}
class Main{
    public static void main(String args[]){
        savings s=new savings();
        current c=new current();
        s.filldetails();
        s.FixedDeposits();
        c.filldetails();
        c.CashCredit();
    }
}
