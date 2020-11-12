package UserDefinedSortDemo;

import java.util.Comparator;

class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
