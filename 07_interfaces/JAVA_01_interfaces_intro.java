
interface Test {

    int Ab=10; // variables are by default public ,static and final in the interface

    void meth1();  // methods are by default public and abstract in interface

    void meth2();
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


// below class becomes abstract class because not overridden all the methods of implemented interfaces
abstract class Sub_Test2 implements Test {

}

public class JAVA_01_interfaces_intro {

    public static void main(String[] args) {

        Test t1;  // interface reference 
        // t1= new Test(); <-- can't create object/instance of interface
        t1 = new Sub_Test1();

        t1.meth1();
        t1.meth2();
        // t1.meth3(); <--- can not be called

        /////////////////////////////////////////////////////////////////

        Sub_Test1 t2;

        t2 = new Sub_Test1();
        t2.meth1();
        t2.meth2();
        t2.meth3();
        
        //////////////////////////////////////////////////////////////////////

    }

}

// meth1 present in sub_test1 : 
// meth2 present in sub_test1 : 

// meth1 present in sub_test1 : 
// meth2 present in sub_test1 : 
// meth3 present in sub_test1 : 