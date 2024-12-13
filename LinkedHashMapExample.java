package practice;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String args[]){
        LinkedHashMap <String, String> l = new LinkedHashMap<>();
        l.put("1","Apple");
        l.put("2","Kiwi");
        l.put("3","Banana");
        l.put("4","Mango");
        l.put("5","Orange");
        l.put("9",null);
        l.put(null,"Grapse");
        l.put(null,"Guava");
        l.put("7",null);

        System.out.println(l);

        System.out.println(l.size());
    }
}
