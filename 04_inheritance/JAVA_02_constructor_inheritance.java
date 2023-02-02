class Parent {

    public Parent() {

        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    public Child() {

        System.out.println("This is child class");
    }
}

class GrandChild extends Child {

    public GrandChild() {

        System.out.println("This is Grandchild class");
    }
}

public class JAVA_02_constructor_inheritance {

    public static void main(String arg[]) {

        Parent p1 = new Parent();

        Child c1 = new Child();

        GrandChild g1 = new GrandChild();
    }

}

// This is parent class

// This is parent class
// This is child class

// This is parent class
// This is child class
// This is Grandchild class