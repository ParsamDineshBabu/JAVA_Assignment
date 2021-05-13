import java.util.Scanner;
public abstract class Presistence {
    Scanner input = new Scanner(System.in);
    abstract void presist();
}
class Database extends Presistence{
    @Override
    void presist() {
        System.out.println("This is Database Presistance");
    }
}
class File extends Presistence{
    @Override
    void presist() {
        System.out.println("This is File Presistance");
    }
}
class Demo{
     public static void main(String args[]){
         Presistence d=new Database();
         Presistence f=new File();
         d.presist();
         f.presist();
        }
        }
