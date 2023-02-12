
// annotations can be used for class,methods,variables and parameters

class Parent {

    @SuppressWarnings("unchecked") // Built-in annotation of java
    public void display() {

        System.out.println("Parent class : ");
    }
}

class Child extends Parent {

    @Override // Built-in annotation of java
    public void display() {

        System.out.println("Child class : ");
    }
}

public class JAVA_01_Built_in_annotations {

    public static void main(String[] args) {

    }
}
