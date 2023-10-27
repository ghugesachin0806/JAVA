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

    public void fun()
    {
        System.out.println("parent fun method");
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

public class JAVA_06_method_overriding {

    public static void main(String arg[]) {

        Parent p1 = new Parent();
        p1.display();

        Child c1 = new Child();
        c1.display();
        c1.print_me();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // dynamic method dispatch in Java

        // creating super class reference and object of sub-class is only allowed which is given below

        // below parent class will be reference and child class object will be created
        Parent p2 = new Child(); // here reference is of super class and object is of sub-class
        p2.display(); // it will call object's method means sub class's method

        // Here only super class's methods and overriden methods by sub class's object are allowed
        // sub-class's (object's) other methods are not allowed .
        // can call all parent class methods either overidden or not, doesn't matter.

        // p2.print_me(); <------ it will not allowed .(it is in object's class(sub class) but not in reference class(super class))

    }

}

// This is parent class

// This is child class
// print_me of child class 

// This is child class