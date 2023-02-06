
// only Inner classes can be static class , outer classes are not allowed to be as static

class Outer {

    static int temp1 = 10;
    int temp2 = 20;

    // static inner classes are directly accessed to the outside without creating outer class's object
    static class Inner {

        // Here only static members of outside class are not allowed in static inner class
        void display() {

            System.out.println("static variable of outside class " + temp1);

            // Non static members of outer class are not allowed in static innner class
            // System.out.println("Non-static variable of outside class " + temp2);
        }

    }
    
}

public class JAVA_04_static_inner_class {
    public static void main(String[] args) {

        // creating static and non-static inner class object have different syntax and implementation

        // creating static inner class object without creating outer class object,
        // it is only allowed in static inner class
        Outer.Inner temp = new Outer.Inner(); // here outer class object is not created , just inner static-class object is created

        // to create non-static inner class's object outside,
        // we have to create inner class's object with outer class's object , shown below
        // Outer.Inner temp = new Outer().new Inner(); 

        temp.display();

    }

}

// static variable of outside class 10