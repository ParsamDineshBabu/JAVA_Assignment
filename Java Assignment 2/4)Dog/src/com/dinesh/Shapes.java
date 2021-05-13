package com.dinesh;
import java.util.Scanner;
public abstract class Shapes {
    Scanner input = new Scanner(System.in);
    int len,breadth,area,side;
    abstract void draw();
}
class line extends Shapes{

    @Override
    void draw() {
        System.out.println("Shape of the line can be Horizontal, Vertical");
    }
}
class rect extends Shapes{

    @Override
    void draw() {
        System.out.println("Enter length of rectangle:");
        len=input.nextInt();
        System.out.println("Enter breadth of rectangle:");
        breadth=input.nextInt();
        area=len*breadth;
        System.out.println("Area of rectangle:"+area);
    }
}
class cube extends Shapes{

    @Override
    void draw() {
        System.out.println("Enter side of cube:");
        side=input.nextInt();
        area=6*side*side;
        System.out.println("Area of Cube:"+area);
    }
}
class main{
    public static void main(String args[]){
        line l=new line();
        rect r=new rect();
        cube c=new cube();
        l.draw();
        r.draw();
        c.draw();
    }
}
