interface Test {

    int Ab = 10; // variables are by default public ,static and final in the interface

    void meth1(); // methods are by default public and abstract in interface

    void meth2();

    // Static , private and default methods can have body inside the interface class

    static void meth4() // can be accessed outside the class without creating object
    {

        System.out.println("static method of interface class ");
    }

    private void meth5() // can only be accessed within this class
    // 'private' methods can not be abstract method
    {

        System.out.println("private method of interface class ");
    }

    default void meth6() // directly can not be accessed , but
    // a class that implements the interface can access this 'default' method by creating object
    // also we can override this method in implemented classes
    {

        meth5(); // private method is used here
        System.out.println("default method of interface class ");
    }
}

class Sub_Test1 implements Test {

    @Override
    public void meth1() {

        System.out.println("meth1 present in sub_test1 : ");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 present in sub_test1 : ");
    }

    public void meth3() {

        System.out.println("meth3 present in sub_test1 : ");
    }

}

// interface is extended in interface
interface Test2 extends Test  // in interface another interface is 'extended'
{

    void meth7();
}

// if interface's all methods which don't have body are not overridden in implemented class ,
// then that class become abstract class
abstract class Sub_Test2 implements Test  // in a class another interface is 'implemented'
{

}

public class JAVA_03_interfaces_methods {
    public static void main(String[] args) {

        // Accessing interface's variable and method without creating object
        System.out.println("Variable of interface class " + Test.Ab);
        Test.meth4(); // static method of interface class

        ////////////////////////////////////////////////////////////////////

        Test t2 = new Sub_Test1();

        t2.meth1();
        t2.meth2();
        t2.meth6(); // default method of interface 

        ///////////////////////////////////////////////////////////////////

        Sub_Test1 t1 = new Sub_Test1();

        t1.meth1();
        t1.meth2();
        t1.meth3();
        t1.meth6();  // default method of interface 

        ///////////////////////////////////////////////////////////////////

    }

}

// Variable of interface class 10
// static method of interface class  

// meth1 present in sub_test1 :      
// meth2 present in sub_test1 :      
// private method of interface class 
// default method of interface class 

// meth1 present in sub_test1 :      
// meth2 present in sub_test1 :      
// meth3 present in sub_test1 :      
// private method of interface class 
// default method of interface class