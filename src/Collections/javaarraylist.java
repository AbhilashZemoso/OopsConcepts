package Collections;

import java.io.*;
import java.util.*;

public class javaarraylist {
    public static void main(String args[]){
        //creation
        ArrayList<Integer> al = new ArrayList<>();
        //add
        al.add(4);
        al.add(10);
        al.add(9);
        al.add(9);
        //add at position
        al.add(0,1);
        //add bulk of elements
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(2);
        temp.add(3);
        al.addAll(temp);
        System.out.println(al);
        // get element
        System.out.println(al.get(0));
        //check empty
        System.out.println(al.isEmpty());
        // get last index of an element
        System.out.println(al.lastIndexOf(4));
        //make duplicate
        System.out.println(al.clone());
        //contains
        System.out.println(al.contains(44));
        //index of element
        System.out.println(al.indexOf(3));
        //remove an element
        System.out.println(al.remove((Integer)(4)));
        //remove bulk elements
        System.out.println(al.removeAll(temp));
        System.out.println(al);
        //clear values
        temp.clear();
        System.out.println(temp);
        //change value
        al.set(0,5);
        System.out.println(al);
        //size
        System.out.println(al.size());
        //sub list
        System.out.println(al.subList(0,2));
        //sort
        System.out.println(al);
        Collections.sort(al);
        //as set
        Set<Integer> s = new HashSet<>(al);
        System.out.println(s);
        //iterator
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            System.out.print(' ');
        }
    }
}
