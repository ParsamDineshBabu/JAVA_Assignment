package com.company;

public class SimpleandCompound {

    public static void main(String[] args) {
        double amt=0,principle=1000,rate=10,time=3,ci,si;
        System.out.println("Principle:"+principle);
        System.out.println("Rate:"+rate);
        System.out.println("Time:"+time);
        amt=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
        System.out.println("Amount:"+amt);
        ci=amt-principle;
        si=(principle*rate*time)/100;
        System.out.println("Simple Interest="+si);
        System.out.println("Compound Interest="+ci);
    }
}
