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

public class JAVA_04_array_of_objects {

    public static void main(String str[]) {

        // creating array of objects

        // Here , only array of object's reference is gets created , not actual object
        // is created

        Subject subs[] = new Subject[3];

        // Creating objects with help of array of object's references

        subs[0] = new Subject("S101", "DS", 100);
        subs[1] = new Subject("s102", "CN", 100);
        subs[2] = new Subject("s103", "OS", 100);

        subs[0].set_marks_obt(10);
        subs[1].set_marks_obt(20);
        subs[2].set_marks_obt(30);

        // calling object array,it will call 'toString' name method only if it present
        // if it is not present , then it will return array objects address

        for (Subject st : subs) {

            System.out.println(st);
        }

        // another simple way

        for (Subject stm : subs) {
            System.out.println(stm.toString());
        }
    }

}

// name : DS sub_id : S101 marks_obt 10 out of 100
// name : CN sub_id : s102 marks_obt 20 out of 100
// name : OS sub_id : s103 marks_obt 30 out of 100

// name : DS sub_id : S101 marks_obt 10 out of 100
// name : CN sub_id : s102 marks_obt 20 out of 100
// name : OS sub_id : s103 marks_obt 30 out of 100