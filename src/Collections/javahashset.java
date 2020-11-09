package Collections;

import java.io.*;
import java.util.*;

public class javahashset {
    public static void main(String args[]) {
        Set<Integer> s = new LinkedHashSet<>();
        //add
        s.add(4);
        //bulk add
        List<Integer> temp = new LinkedList<>();
        temp.add(3);
        temp.add(2);
        s.addAll(temp);
        System.out.println("Linked Hash Set maintains insertion order");
        System.out.println(s);
        //check empty
        System.out.println(s.isEmpty());
        //make duplicate
        System.out.println(((LinkedHashSet<Integer>) s).clone());
        //contains
        System.out.println(s.contains(3));
        //remove
        System.out.println(s.remove(3));
        //size
        System.out.println(s.size());
        //iterator
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println("\n");
        Set<Integer> tree = new TreeSet<>(s);
        tree.add(10);
        tree.add(0);
        System.out.println("Tree Set stores in sorted order");
        System.out.println(tree);


        Set<String> hash = new HashSet<>();
        hash.add("3");
        hash.add("215");
        hash.add("31");
        hash.add("299");
        hash.add("6");
        System.out.println("\nHash Set does not maintain any order");
        System.out.println(hash);
    }
}
