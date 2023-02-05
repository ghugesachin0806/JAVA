class Parent {

    // constructor
    public Parent() {

        System.out.println("constructor of parent :");
    }

    // method
    public void display() {

        System.out.println("display method of parent :");
    }
}

class Son {

    Parent p1;

    // constructor
    public Son() {

        System.out.println("constructor of son :");

        // p1 object cannot be easily accessed by outside world
        p1 = new Parent(); // p1 is tightly coupled to son
    }

    // method
    public void display() {

        System.out.println("display method of son :");
        p1.display();
    }
}

public class JAVA_01_tight_coupling {

    public static void main(String[] args) {

        Son s1 = new Son();

        s1.display();

        // s1.display() will print Parent and Son
        // this implementation can not be changed dynamically being tight coupling
    }
}

// constructor of son :
// constructor of parent :

// display method of son :
// display method of parent :