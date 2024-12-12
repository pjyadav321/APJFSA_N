import java.util.ArrayList;
import java.util.Collections;

public class ReversingArrayList {
    public static void main(String  args[]){
        ArrayList <Integer> ar= new ArrayList<>();
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(87);
        ar.add(2);
        ar.add(4);

        System.out.println("Original List: "+ar);

        Collections.reverse(ar);
        System.out.println("Reversed List: "+ar);

        Collections.sort(ar);
        System.out.println("Sorted list: "+ar);
    }
}
