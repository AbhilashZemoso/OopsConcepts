package UserDefinedSortDemo;

import java.util.Comparator;

//Comparator useful when sorting on many individual variables
class Sortbyrollno implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}
