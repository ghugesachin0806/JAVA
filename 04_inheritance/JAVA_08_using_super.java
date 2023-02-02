// Here 'super' keyword is used to call parent class method first ,then child class

class Parent {

    // Methods
    public void display() {

        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    // Methods
    @Override // optional to write ,it ensures the method overriding3
    public void display() {

        // 'super' keyword is used to call parent class method first ,then child class
        super.display();

        System.out.println("This is child class");
    }
}

public class JAVA_08_using_super {
    public static void main(String srg[]) {

        Child c1 = new Child();

        c1.display();
    }

}

// This is parent class
// This is child class