// if class have abstract method then class must be abstract .
// if class don't have any abstract method , then we can assign it abstract or concrete class .

// Object of abstract class cannot be instantiated , only reference can be created for its child classes.

// abstract class
abstract class Parent {

    public Parent() {

        System.out.println("Parent class ");
    }

    // Abstract method
    abstract public void display();
}

// Abstract class ( not override abstract method of parent class )
abstract class Child1 extends Parent {

    public Child1() {

        System.out.println("Child1 class ");
    }

}

// Concrete class ( override abstract method of parent class )
class Child2 extends Parent {

    public Child2() {

        System.out.println("Child2 class ");
    }

    // Overridden abstract method of parent class
    @Override
    public void display() {

        System.out.println("Child2 concrete class ");
    }
}

public class JAVA_01_abstract_intro {

    public static void main(String arg[]) {

        Child2 ch2 = new Child2(); // Concrete class

        // reference of super abstract class is allowed , object creation is not allowed
        Parent p1 = new Child2(); // Only reference of abstract class is allowed

        // Parent p3 = new Parent(); // Not allowed because class is abstract class
        // Parent p2 = new Child1(); // Not allowed because class is abstract class

    }
}
