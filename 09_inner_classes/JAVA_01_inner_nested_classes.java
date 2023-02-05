class Outer {

    public int temp1;
    private int temp2;
    Inner obj3; // this object of innner class is available in entire 'outer' class

    // constructor
    public Outer() {

        this.temp1 = 10;
        this.temp2 = 20;
        obj3 = new Inner();

        System.out.println("Outer class constructor : ");
    }

    // methods
    public void outer_meth1() {

        System.out.println("Outer class display :");
    }

    public void outer_meth2() {

        Inner t1; // this object of inner class is only accesssed within this method
        t1 = new Inner();

        System.out.println("Inner class object variable : " + t1.item1);

        t1.inner_meth1();
        t1.inner_meth2();
    }

    // Inner nested class
    class Inner {

        public int item1;

        // constructor
        public Inner() {

            this.item1 = 30;
        }

        public void inner_meth1() {

            System.out.println("inner class display :");
            System.out.println("Inner class variable : " + item1); // inner class variable
            System.out.println("Outer class public variable : " + temp1); // outer class public variable accessed by inner class
            System.out.println("Inner class private variable : " + temp2); // outer class private variable accessed by inner class
        }

        public void inner_meth2() {

            outer_meth1();  // outer class method
        }

    }

    ///////////////////////////////////////////

    public void outer_meth3() {
        System.out.println("Inner class variable : " + obj3.item1);
        obj3.inner_meth1();
    }
}

public class JAVA_01_inner_nested_classes {

    public static void main(String[] args) {

        // outer class object
        Outer obj1;
        obj1 = new Outer();

        obj1.outer_meth1();
        obj1.outer_meth2();
        obj1.outer_meth3();

        ///////////////////////////////////////////////////////////////

        // creating direct inner class object with help of outer class object

        // Below, first outer class object is created, after that inner class object is created 
        Outer.Inner obj2 = new Outer().new Inner(); 

        obj2.inner_meth1();
        obj2.inner_meth2();
        System.out.println("inner class object variable " + obj2.item1);

    }

}

// classes created in directories are
// 1. JAVA_01_inner_nested_classes.class
// 2. Outer.class
// 3. Outer$inner.class <--- like this inner class from outer class is created in directory


// output -  

// Outer class constructor : 
// Outer class display :
// Inner class object variable : 30 
// inner class display :
// Inner class variable : 30        
// Outer class public variable : 10 
// Inner class private variable : 20
// Outer class display :
// Inner class variable : 30        
// inner class display :
// Inner class variable : 30        
// Outer class public variable : 10
// Inner class private variable : 20
// Outer class constructor :
// inner class display :
// Inner class variable : 30
// Outer class public variable : 10
// Inner class private variable : 20
// Outer class display :
// inner class object variable 30