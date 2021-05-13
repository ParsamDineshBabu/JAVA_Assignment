package sortWeightusingTreeSet;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public class sortWeightusingtreeset {
    private int weight;
    private int height;
    private String name;
    public sortWeightusingtreeset(int weight,int height,String name){
        this.weight=weight;
        this.height=height;
        this.name=name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class heightComparator implements Comparator<sortWeightusingtreeset> {
    @Override
    public int compare(sortWeightusingtreeset s1, sortWeightusingtreeset s2) {
        return s1.getHeight()-s2.getHeight();
    }
}
class weightComparator implements Comparator<sortWeightusingtreeset>{
    @Override
    public int compare(sortWeightusingtreeset s1, sortWeightusingtreeset s2) {
        return s1.getWeight()-s2.getWeight();
    }
}
class treeset1{
    public static void main(String[] args){
        TreeSet<sortWeightusingtreeset> set=new TreeSet<sortWeightusingtreeset>(new weightComparator());
        set.add(new sortWeightusingtreeset(58,5,"dinesh"));
        set.add(new sortWeightusingtreeset(58,6,"chinna"));
        set.add(new sortWeightusingtreeset(48,4,"sai"));
        set.add(new sortWeightusingtreeset(60,5,"manoj"));
        set.add(new sortWeightusingtreeset(58,7,"rammohan"));
        System.out.println("Sorted Order based on Weight");
        for(sortWeightusingtreeset ele:set){
            System.out.print(ele.getWeight()+" "+ele.getHeight()+" "+ele.getName());
            System.out.println();
        }
        TreeSet<sortWeightusingtreeset> set1=new TreeSet<sortWeightusingtreeset>(new heightComparator());
        set1.add(new sortWeightusingtreeset(58,5,"dinesh"));
        set1.add(new sortWeightusingtreeset(58,6,"chinna"));
        set1.add(new sortWeightusingtreeset(48,4,"sai"));
        set1.add(new sortWeightusingtreeset(60,5,"manoj"));
        set1.add(new sortWeightusingtreeset(58,7,"rammohan"));
        System.out.println("Sorted Order based on Height");
        for(sortWeightusingtreeset ele:set1){
            System.out.print(ele.getWeight()+" "+ele.getHeight()+" "+ele.getName());
            System.out.println();
        }
    }
}

