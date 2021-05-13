package dinesh;

import java.util.ArrayList;
public class replaceAll {
    public static void main(String[] args){
        //private char[] Letters={'A','B','C','D'};
        ArrayList<String> stu=new ArrayList<String>();
        stu.add("Dinesh");
        stu.add("Chinna");
        stu.add("Sai");
        stu.add("Manoj");
        stu.replaceAll(n->(n.toUpperCase()));
        System.out.println(stu);
    }
}
