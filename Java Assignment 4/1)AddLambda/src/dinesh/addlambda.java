package dinesh;
import java.util.Scanner;
interface MyLambda{
    int add(int c,int d);
}
public class addlambda {
    public static void main(String[] args) {
        Integer a,b;
        Scanner input=new Scanner(System.in);
        MyLambda fun = (int c, int d) -> (c + d);
        System.out.print("Enter a Value:");
        a=input.nextInt();
        System.out.print("Enter b Value:");
        b=input.nextInt();
        System.out.println("Addition of two numbers using lambda:" +fun.add(a,b));
    }
}
