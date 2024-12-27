package practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {
    public static void main(String args[]){
        //Deque <String> d = new ArrayDeque<>();
        ArrayDeque <String> obj = new ArrayDeque<>();
        obj.add("P");
        obj.add("o");
        obj.add("o");
        obj.add("j");
        obj.add("a");
        System.out.println(obj);

        obj.addFirst("Priyanshi");
        obj.addLast("Shivansh");
        System.out.println(obj.size());
        System.out.println(obj.contains("o"));

        Iterator <String> i = obj.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
