
// In singleton class only one object created and single object can be used by all other classes,
// using different references

class Test {

    private int temp1;
    private int temp2;
    static private Test t1 = null; // reference for class object declared

    private Test() {

        temp1 = 10;
        temp2 = 20;
    }

    public void display() {

        System.out.println("This is the display method : ");
    }

    static Test get_object() // to get reference using static method for outside the class
    {
        if (t1 == null) {
            t1 = new Test(); // object to reference is created only once
        }
        return t1;
    }
}

public class JAVA_04_singleton_class {

    public static void main(String[] args) {

        // Here two references have the same object
        Test obj1 = Test.get_object();
        Test obj2 = Test.get_object();

        obj1.display();

        if (obj1 == obj2)  // Here same object is used for two references
        {

            System.out.println("Two reference are used for the same object");
        }
    }

}

// This is the display method : 
// Two reference are used for the same object