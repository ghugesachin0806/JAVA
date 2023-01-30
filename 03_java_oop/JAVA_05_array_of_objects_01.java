// import java.lang.*;
// import java.util.*;

class Subject {

    // data types variables

    private String sub_id;
    private String sub_name;
    private int max_marks;
    private int marks_obt;

    // constructors

    public Subject(String sub_id, String sub_name) // 'this' keyword is used here.
    {

        this.sub_id = sub_id;
        this.sub_name = sub_name;
    }

    public Subject(String str_subid, String str_name, int temp_max_marks) {
        sub_id = str_subid;
        sub_name = str_name;
        max_marks = temp_max_marks;
    }

    // getter methods
    public String get_sub_id() {
        return sub_id;
    }

    public String get_sub_name() {
        return sub_name;
    }

    public int get_max_marks() {
        return max_marks;
    }

    public int get_marks_obt() {
        return marks_obt;
    }

    // setter methods
    public void set_marks_obt(int marks_obt) {

        this.marks_obt = marks_obt;
    }

    public void set_max_marks(int max_marks) {

        this.max_marks = max_marks;
    }

    // Methods

    boolean isQualified() {

        return marks_obt >= ((40 * max_marks) / 100);
    }

    public String toString() {

        return "name : " + sub_name + " sub_id : " + sub_id + " marks_obt " + marks_obt + " out of " + max_marks;
    }

}

class Student {

    // data types variables

    private String name;
    private String dept;
    private int roll_no;
    Subject subs[];

    // constructors

    public Student(String name, int roll_no, String dept) {

        this.name = name;
        this.dept = dept;
        this.roll_no = roll_no;
        this.subs = new Subject[3];

        subs[0] = new Subject("S101", "DS", 100);
        subs[1] = new Subject("s102", "CN", 100);
        subs[2] = new Subject("s103", "OS", 100);
    }

    // getter methods
    public String get_name() {
        return name;
    }

    public int get_roll_no() {
        return roll_no;
    }

    public String get_dept() {
        return dept;
    }

    // setter methods
    public void set_marks_obt(int sub1, int sub2, int sub3) {

        subs[0].set_marks_obt(sub1);
        subs[1].set_marks_obt(sub2);
        subs[2].set_marks_obt(sub3);

    }

    // Methods

    public void print_me() {

        int k = this.subs[0].get_marks_obt();
        int m = this.subs[1].get_marks_obt();
        int l = this.subs[2].get_marks_obt();

        System.out.println("name : " + this.name + "\nroll_no : " + this.roll_no + "\ndept : " + this.dept
                + "\nsub1 : DS : " + k + "\nsub2 : CN : " + m + "\nsub3 : OS : " + l + "\n");
    }

}

public class JAVA_05_array_of_objects_01 {

    public static void main(String str[]) {

        Student std[] = new Student[3];

        std[0] = new Student("sachin", 101, "entc");
        std[1] = new Student("soham", 102, "cs");
        std[2] = new Student("ram", 103, "it");

        std[0].set_marks_obt(10, 20, 30);
        std[1].set_marks_obt(30, 40, 50);
        std[2].set_marks_obt(90, 80, 70);

        for (Student temp : std) {
            temp.print_me();
        }

    }

}

// name : sachin 
// roll_no : 101 
// dept : entc   
// sub1 : DS : 10
// sub2 : CN : 20
// sub3 : OS : 30

// name : soham  
// roll_no : 102 
// dept : cs     
// sub1 : DS : 30
// sub2 : CN : 40
// sub3 : OS : 50

// name : ram
// roll_no : 103
// dept : it
// sub1 : DS : 90
// sub2 : CN : 80
// sub3 : OS : 70