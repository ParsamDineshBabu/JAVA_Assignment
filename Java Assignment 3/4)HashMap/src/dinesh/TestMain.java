package dinesh;

import java.util.HashMap;
import java.util.Map;

class TestMain{
    public static void main(String[] args) {
        emp e1 = new emp("dinesh");
        emp e2 = new emp("chinna");
        emp e3 = new emp("sai");
        Date d1 = new Date(1, 11, 1998);
        Date d2 = new Date(1, 11, 2000);
        Date d3 = new Date(2, 12, 1998);
        Map<Date, emp> m1;
        m1 = new HashMap<Date, emp>(new datacomparator());
        m1.put(d1,e1);
        m1.put(d1,e2);
        m1.put(d1,e3);
        m1.put(d2,e1);
        m1.put(d2,e2);
        m1.put(d3,e3);
        for(Map.Entry<Date,emp> entry: m1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }}


