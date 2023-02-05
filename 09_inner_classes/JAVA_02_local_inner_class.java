class Test {

    public void display() {

        System.out.println("Outer Test class : ");

        class Temp // local inner class inside method
        {

            public void inner_display() {

                System.out.println("Inner local class method : ");
            }
        }

        // one way
        Temp t1 = new Temp();
        t1.inner_display();

        // another way using anonymous class
        new Temp().inner_display();

    }
}

public class JAVA_02_local_inner_class {

    public static void main(String[] args) {

        Test t2 = new Test();

        t2.display();
    }

}

// Outer Test class : 
// Inner local class method : 
// Inner local class method :