import java.util.Scanner;
public class Simplewithuserinputs {
    public static void main(String[] args) {
        double amt=0,principle=1000,rate=10,time=3,ci,si;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principle: ");
        principle=input.nextDouble();
        System.out.print("Enter the Rate: ");
        rate=input.nextDouble();
        System.out.print("Enter the Time: ");
        time=input.nextDouble();
        si=(principle*rate*time)/100;
        amt=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
        //System.out.println("Amount:"+amt);
        ci=amt-principle;
        System.out.println("Principle:"+principle);
        System.out.println("Rate:"+rate+"% Percent");
        System.out.println("Time:"+time+" Years");
        System.out.println("Simple Interest="+si);
        System.out.println("Compound Interest="+ci);
    }
}
