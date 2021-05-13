package dinesh;

import java.util.ArrayList;
public class oddlengths {
    //String n;
    public static void main(String[] args){
        ArrayList<String> stu=new ArrayList<String>();
        stu.add("Dinesh");
        stu.add("Chinna");
        stu.add("Sai");
        stu.add("Manoj");

        stu.removeIf(n->(n.length()%2!=0));
        for(String str:stu){
            System.out.println(str);
        }
    }
}
