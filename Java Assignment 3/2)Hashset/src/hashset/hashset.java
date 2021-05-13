package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class hashset {
    public static void main(String[] args){
        HashSet<String> h1=new HashSet<>();
        h1.add("Chinna");
        h1.add("Dinesh");
        h1.add("Elephant");
        h1.add("Fan");
        h1.add("Graph");
        System.out.println("HashSet is Unordered");
        Iterator<String> i=h1.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("____________________________");
        LinkedHashSet<String> h2=new LinkedHashSet<>();
        h2.add("Chinna");
        h2.add("Dinesh");
        h2.add("Elephant");
        h2.add("Fan");
        h2.add("Graph");
        System.out.println("LinkedHashSet is Ordered");
        Iterator<String> i1=h2.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}
