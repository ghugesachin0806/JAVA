// import java.lang.*; <---- It is imported automatically


// Every class is directly or indirectly inheriting from 'Object' class

// Below class don't have any methods of its own
class Test {

}

// overridding Object class methods,
// from which 'Exam' class is directly or indirectly inheriting
class Exam {

    // overridding toString() method of Object class
    public String toString() {

        return "Exam class String";
    }

    // overridding hashcode() method of Object class
    public int hashCode()
    {
        return 10000;
    }

    // we cannot override below methods because they are final methods of Object class
    // 1. wait();
    // 2. Notify();
    // 3. NotifyAll();

}

public class JAVA_01_object_class {
    public static void main(String[] args) {

        // Object class's Objects
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;

        // isequal method of object class
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj1));
        System.out.println(obj3.equals(obj1));


        // toString method of object class
        System.out.println(obj1.toString());
        System.out.println(obj1); // same toString method will be called here

        // hashcode of the object which is unique for every object
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        ////////////////////////////////////////////////////////////////////////////////

        Test t1 = new Test();

        // Test class object is using Object class's methods
        // It means every class is directly or indirectly inheriting from the object
        // class
        System.out.println(t1.hashCode());
        System.out.println(t1);
        System.out.println(t1.toString());


        //////////////////////////////////////////////////////////////////////////////////

        Exam e1 = new Exam();

        // calling overridded method of object class
        System.out.println(t1.hashCode());
        System.out.println(e1.toString());
        System.out.println(e1);



    }
}

// false
// false
// true

// java.lang.Object@2c7b84de
// java.lang.Object@2c7b84de

// 746292446
// 1072591677

// 1175962212
// Test@4617c264
// Test@4617c264

// 1175962212
// Exam class String
// Exam class String