package dinesh;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class failsafe {
    public static void main(String[] args){
        List<String> list=new CopyOnWriteArrayList<String>();
        list.add("Aye");
        list.add("Bye");
        list.add("Cat");
        list.add("Dog");
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<String> i=list.iterator();
                while (i.hasNext())
                {
                    System.out.println("Thread1"+i.next());
                }
            }
        });
        t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                list.add("Eagle");
                Iterator<String> i=list.iterator();
                while (i.hasNext())
                {
                    System.out.println("Thread2"+i.next());
                }
            }
        });
        t2.start();
    }
}
