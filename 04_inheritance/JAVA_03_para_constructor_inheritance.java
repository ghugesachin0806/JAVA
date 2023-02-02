
// Parent class
class Parent {

    public Parent() {

        System.out.println("This is parent class of non-para ");
    }

    public Parent(int x) {

        System.out.println("This is parent class of para "+x);
    }
}

// Child class
class Child extends Parent {

    public Child() {

        System.out.println("This is child class of non-para ");
    }

    public Child(int x) {

        System.out.println("This is child class of para "+x);
    }
}

// GrandChild class
class GrandChild extends Child {

    public GrandChild() {

        System.out.println("This is Grandchild class of non-para ");
    }

    public GrandChild(int x) {

        System.out.println("This is Grandchild class of para "+x);
    }
}

public class JAVA_03_para_constructor_inheritance {

    public static void main(String arg[]) {

        GrandChild g1 = new GrandChild();

        GrandChild g2 = new GrandChild(10);

    }

}

// -------> for g1
// This is parent class of non-para
// This is child class of non-para
// This is Grandchild class of non-para

// -------> for g2
// This is parent class of non-para
// This is child class of non-para
// This is Grandchild class of para 10