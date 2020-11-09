package Collections;

import java.util.*;
import  java.lang.*;

public class javamap {
    public static void main(String args[]){
        Map<Integer,String> mp = new HashMap<>();
        //add key value pairs
        mp.put(44,"abhi");
        mp.put(500,"abhi");
        mp.put(313,"vamsi");
        mp.put(19,"nagraj");
        //display
        System.out.println(mp);
        //add if not present
        System.out.println(mp.putIfAbsent(2,"ganapathi"));
        //remove key value
        System.out.println(mp.remove(1,"ab"));
        //set of keys
        System.out.println(mp.keySet());
        //set of key values
        Set<Map.Entry<Integer,String>> s =mp.entrySet();
        System.out.println(s);
        //contains key
        System.out.println(mp.containsKey((Integer)(3)));
        //contains value
        System.out.println(mp.containsValue((String)("vamsi")));
        //values
        System.out.println(mp.values());
        //iterator
        Set<Map.Entry<Integer,String>> st = mp.entrySet();
        Iterator it = st.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> me = (Map.Entry)it.next();
            System.out.printf("%d %s\n",me.getKey(),me.getValue());
        }
        //sort by key
        Map<Integer,String> tm =  new TreeMap<>(mp);
        System.out.println(tm);
    }
}
