package UserDefinedSortDemo;

import java.util.*;
import java.lang.*;


//Comparable useful when only sorting based on one variable
class Student implements Comparable<Student> {
    int rollno;
    String name, address;


    public Student(int rollno, String name,
                   String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }


    public String toString() {
        return this.rollno + " " + this.name +
                " " + this.address;
    }

    public int compareTo(Student other) {
        return this.rollno - other.rollno;
    }
}


//Comparator useful when sorting on many individual variables
class Sortbyrollno implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

// Driver class
public class classsort {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyrollno());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar);

        System.out.println("\nSorted by rollno using Comparable");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
