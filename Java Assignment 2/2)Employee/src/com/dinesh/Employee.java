package com.dinesh;
import java.util.Scanner;
public class Employee {
    Scanner input = new Scanner(System.in);
    String Empname,lab;
    int incentive,overtime;
    void getDetails() {
        System.out.print("Enter Manager Name:");
        Empname = input.nextLine();
        }
    void show() {
        System.out.println("Employee name:" + Empname);
    }
}
class Manager extends Employee {
    int salary=25000;
    void Managersalary() {
        System.out.print("Employee incentive amount:");
        incentive = input.nextInt();
        salary = salary + incentive;
        System.out.println("Manager salary:" + salary);
    }
}
class labour extends Employee{
    int salary=3000;
    void getDetails() {
        System.out.print("Enter Labour Name:");
        lab = input.nextLine();
    }
    void show() {
        System.out.println("Labour name:" + lab);
        System.out.print("over time payment:");
        overtime = input.nextInt();
        salary=salary+overtime;
        System.out.println("Labour Salary:"+salary);
    }
}
class main{
    public static void main(String args[]){
        Manager m=new Manager();
        labour l=new labour();
        m.getDetails();
        m.show();
        m.Managersalary();
        l.getDetails();
        l.show();

    }
}
