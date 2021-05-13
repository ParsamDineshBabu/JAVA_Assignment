package com.company;
import java.util.Scanner;
public class Studentmarks {
    public static void main(String[] args) {
        double s1,s2,s3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Subject1 Marks: ");
        s1=input.nextDouble();
        System.out.print("Enter the Subject2 Marks: ");
        s2=input.nextDouble();
        System.out.print("Enter the Subject3 Marks: ");
        s3=input.nextDouble();
        if(s1>60 || s2>60 || s3>60){
            if(s2>60&&s3>60){
                System.out.println("Promoted");
                if(s1>60){
                    System.out.println("Passed");
                }
            }
            else if(s1>60&&s3>60){
                System.out.println("Promoted");
                if(s2>60){
                    System.out.println("Passed");
                }
            }
            else if(s1>60&&s2>60){
                System.out.println("Promoted");
                if(s3>60){
                    System.out.println("Passed");
                }
            }
            else{
                System.out.println("Failed");
            }
        }
    }
}
