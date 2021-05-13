package com.company;
import java.util.Scanner;
public class Student {
    Scanner input = new Scanner(System.in);
        int tot=0,avg=0;
        String name;
        int marks[];
        Student(){
            System.out.print("Enter the Student name: ");
            name=input.next();
            getMarks();
        }
        public void getMarks(){
            marks=new int[3];
            System.out.print("Enter the Subject1 Marks: ");
            marks[0] = input.nextInt();
            System.out.print("Enter the Subject2 Marks: ");
            marks[1] = input.nextInt();
            System.out.print("Enter the Subject3 Marks: ");
            marks[2] = input.nextInt();
            for(int i=0;i<3;i++){
                tot=tot+marks[i];
                avg=tot/3;
            }
            System.out.println("Total Marks of " +name+ ":" +tot);
            System.out.println("Average of " +name+ ":" +avg);
        }

    }
    class studentdemo{
    public static void main(String args[]){
        Student s[]=new Student[3];
        for(int i=0;i<3;i++){
            s[i]=new Student();
        }
    }
    }
