package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l.add(1);
        l.add(11);
        l.add(21);
        l.add(31);
        l.add(3, 45);
        System.out.println(l);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l.addAll(l2);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        System.out.println(l.get(3));
        l.remove(1);
        System.out.println(l);
        l.set(3, 999);
        System.out.println(l);
        System.out.println(l.contains(null));
        // printing elements using for loop
        System.out.println("For loop");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        // Using foreach loop
        System.out.println("Foreach Loop");
        for (int element : l) {
            System.out.println(element);
        }
        // using iterator
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            System.out.println("Element is :" + it.next());
        }
        l.clear();
        System.out.println(l);
    }
}
