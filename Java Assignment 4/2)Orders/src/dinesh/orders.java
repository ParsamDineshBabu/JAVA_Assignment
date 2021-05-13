package dinesh;

import java.util.Scanner;
interface MyLambda{
    int cost(int c);
}
public class orders {
    public static void main(String[] args) {
        Integer a;
        Scanner input=new Scanner(System.in);
        MyLambda fun = (int c) ->{
            if(c>10000) System.out.println("Accepted/Completed");
            else System.out.println("Rejected");
            return c;
        };
        System.out.print("Enter a order value:");
        a=input.nextInt();
        System.out.println("Order Value is:" +fun.cost(a));
    }
}
