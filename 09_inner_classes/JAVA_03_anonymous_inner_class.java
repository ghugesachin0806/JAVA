// anonymous classes can be defined at the time of creating of object itself from abstract,inerface or concrete class,
// while creating anonymous class ,we can override previous methods of parent class but can't create new methods

// Two ways of creating anonymous classes with syntaxs
// 1. Super_class object_name = new Super_class{ overridden methods };
// 2. new Super_class{ overridden methods}.method_to_call();

// while creating anonymous class and its object, we can only override the methods present in their 
// parent classes , we cannot create new methods while creating anonymous classes from concrete , abstract and interface .

// abstract class
abstract class Test {

    abstract public void meth1();

    public void meth2() {

        System.out.println("meth2 method in abstract Test class : ");
    }

    public void meth3() {
    }

}

// interface class
interface Temp {
    void meth3();
}

// concreate class
class Tail {

    public void meth4() {

        System.out.println("meth4 method in concrete Tail class : ");
    }

    public void meth5() {
    }

}

public class JAVA_03_anonymous_inner_class {

    // for abstract class
    public void temp_meth1() {

        // created object with anonymous class from abstract class

        // one way
        Test t1 = new Test() {

            public void meth1() {
                System.out.println("meth1 method in Test abstract class : ");
            }

            public void meth3() {
                System.out.println("meth3 method in Test abstract class : ");
            }

        };

        t1.meth1();
        t1.meth2();
        t1.meth3();

        // another way without creating object name

        new Test() {

            public void meth1() {
                System.out.println("meth1 method in Test abstract class : ");
            }
        }.meth1();

        new Test() {

            public void meth1() {
                System.out.println("meth1 method in Test abstract class : ");
            }
        }.meth2();
    }

    // for interface
    public void temp_meth2() {
        // created object with anonymous class from interface

        // one way
        Temp t1 = new Temp() {

            public void meth3() {
                System.out.println("meth3 method in interface Temp : ");
            }

        };

        t1.meth3();

        //  another way without creating object name
        new Temp() {
            public void meth3() {
                System.out.println("meth3 method in interface Temp : ");
            }
        }.meth3();
    }

    // for concrete class
    public void temp_meth3() {

        // created object with anonymous class from concrete class
        Tail t = new Tail() {

            public void meth5() {
                System.out.println("meth1 method in Tail concrete class : ");
            }

        };

        t.meth5();
        t.meth4();

        // above mentioned two way implementation can be apply in this class also.
    }

    public static void main(String[] args) {

        JAVA_03_anonymous_inner_class t1 = new JAVA_03_anonymous_inner_class();

        t1.temp_meth1();
        t1.temp_meth2();
        t1.temp_meth3();
    }
}

// meth1 method in Test abstract class : 
// meth2 method in abstract Test class : 
// meth3 method in Test abstract class : 

// meth1 method in Test abstract class : 
// meth2 method in abstract Test class : 

// meth3 method in interface Temp :     

// meth3 method in interface Temp :      

// meth1 method in Tail concrete class : 
// meth4 method in concrete Tail class :