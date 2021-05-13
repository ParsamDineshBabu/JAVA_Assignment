package dinesh;

import java.util.Arrays;
import java.util.List;
public class remove {
    public static void main(String[] args){
List<Object> list=Arrays.asList(“Dinesh”,”chinna”,”chintu”);
StringBuilder first=new StringBuilder();
List.forEach(s->first.append(s.substring(0,1)));
System.out.println(first);
}}
