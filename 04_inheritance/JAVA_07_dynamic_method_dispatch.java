// import java.lang.*;

class Parent {

    // Constructor
    public Parent() {

        // System.out.println("parent class");
    }

    // Methods
    public void display() {

        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    // Constructor
    public Child() {

        // System.out.println("child class");
    }

    // Methods
    @Override // optional to write ,it ensures the method overriding3
    public void display() {

        System.out.println("This is child class");
    }

    public void print_me() {
        System.out.println("print_me of child class ");
    }
}

public class JAVA_07_dynamic_method_dispatch {

    public static void main(String arg[]) {

        // Here super class reference is there for sub-class's object
        Parent p1 = new Child();

        // Child c1 = new Parent(); <------- not allowed

        p1.display(); // Child method will be called
        // p1.print_me(); // Not allowed , only superclass's method and overridden methods allowed

        Child c1;
        c1=new Child();

        // Both the methods of child class are allowed , because reference is also of Child class
        c1.display();
        c1.print_me();

    }
}

// This is child class