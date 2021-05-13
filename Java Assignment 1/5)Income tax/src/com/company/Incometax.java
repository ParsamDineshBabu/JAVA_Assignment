package com.company;
import java.util.Scanner;
public class Incometax {
    public static void main(String[] args) {
        double income,tax;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Income: ");
        income=input.nextDouble();
        if(income>0 && income<180000)
        {
            System.out.print("No Need to Pay Tax");
        }
        else if(income>181001 && income<300000)
        {
            tax=(10*income)/100;
            System.out.print("Tax To Be Paid:"+tax);
        }
        else if(income>300001 && income<500000)
        {
            tax=(20*income)/100;
            System.out.print("Tax To Be Paid:"+tax);
        }
        else if(income>500001 && income<1000000)
        {
            tax=(30*income)/100;
            System.out.print("Tax To Be Paid:"+tax);
        }
    }
}
