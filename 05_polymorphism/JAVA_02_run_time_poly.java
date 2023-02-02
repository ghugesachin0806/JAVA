class Parent {

    // Methods
    public void display() {

        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    // Methods
    @Override
    public void display() {

        System.out.println("This is child class");
    }

    public void print_me() {
        System.out.println("print_me of child class ");
    }
}

public class JAVA_02_run_time_poly {
    
    public static void main(String arg[])
    {

        // Here , due to 'new' keyword object is formed in heap at runtime
        // There are two objects possibilities using parent class reference
        // so object is formed at runtime , so method called is depends on object created,
        // so we can say that method is decide at runtime, it is called as runtime polymorphism

        // 1st possibility of object at runtime and method called at runtime
        Parent p1 =new Parent();
        p1.display();

        // 2nd possibility of object at runtime and method called at runtime
        Parent p2 =new Child();
        p2.display();

    }
}

// This is parent class
// This is child class