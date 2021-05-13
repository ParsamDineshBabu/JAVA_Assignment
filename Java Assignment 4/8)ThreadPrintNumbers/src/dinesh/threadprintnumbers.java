package dinesh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class threadprintnumbers {
    static void printValue(int val){
        System.out.println(val);
    }
        public static void main(String[] args){
            List<Integer> list=new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            Thread t1=new Thread(new Runnable() {
                @Override
                public void run() {
                    Consumer<Integer> i=threadprintnumbers::printValue;
                    i.accept(12);
                    i.accept(13);
                }
        });
        }
}
