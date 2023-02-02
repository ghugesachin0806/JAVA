
// Parent class
class Parent {

    public Parent() {

        System.out.println("This is parent class of non-para ");
    }

    public Parent(int x) {

        System.out.println("This is parent class of para " + x);
    }
}

// Child class
class Child extends Parent {

    public Child() {

        System.out.println("This is child class of non-para ");
    }

    public Child(int x) {

        System.out.println("This is child class of para " + x);
    }

    public Child(int x, int y) {

        // To call parameterized constructor of parent class
        super(y);
        System.out.println("This is child class of 2nd para " + x);
    }
}

// GrandChild class

class GrandChild extends Child {

    public GrandChild() {

        System.out.println("This is Grandchild class of non-para ");
    }

    public GrandChild(int x) {

        System.out.println("This is Grandchild class of para " + x);
    }

    public GrandChild(int x, int y) {

        super(x);
        System.out.println("This is Grandchild class of 2nd para " + y);
    }

    public GrandChild(int x, int y, int z) {

        super(x, z);
        System.out.println("This is Grandchild class of 3rd para " + y);
    }
}

public class JAVA_04_parent_para_constructor {

    public static void main(String arg[]) {

        // Statement - 1
        Child c1 = new Child(10);

        // Statement - 2
        Child c2 = new Child(10, 20);

        // Statement - 3
        GrandChild g1 = new GrandChild(11, 12);

        // Statement - 4
        GrandChild g2 = new GrandChild(22, 33, 44);

    }

}

// Statement - 1
// This is parent class of non-para
// This is child class of para 10

// Statement - 2
// This is parent class of para 20
// This is child class of 2nd para 10

// Statement - 3
// This is parent class of non-para
// This is child class of para 11
// This is Grandchild class of 2nd para 12

// Statement - 4
// This is parent class of para 44
// This is child class of 2nd para 22
// This is Grandchild class of 3rd para 33