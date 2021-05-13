package dinesh;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class Arraylist {
    public static void main(String[] args){
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        ListIterator listIterator=l1.listIterator(l1.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
