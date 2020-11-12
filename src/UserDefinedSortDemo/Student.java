package UserDefinedSortDemo;

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
