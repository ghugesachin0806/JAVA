
// Abstract class
abstract class KFC {

    // Non-Abstarct method
    public void make_items() {

        System.out.println("KFC class make_items method : ");
    }

    // Abstract methods
    abstract public void billing();

    abstract public void offers();

}

// Concrete class
class My_KFC1 extends KFC {

    @Override
    public void billing() {

        System.out.println("My_KFC1 class billing method : ");
    }

    @Override
    public void offers() {

        System.out.println("My_KFC1 class offers method : ");
    }

    public void parking()
    {

        System.out.println("My_KFC1 class parking method : ");
    }
}

class My_KFC2 extends KFC {

    @Override
    public void make_items() {

        System.out.println("My_KFC2 class make_items method : ");
    }

    @Override
    public void billing() {

        System.out.println("My_KFC2 class billing method : ");
    }

    @Override
    public void offers() {

        System.out.println("My_KFC2 class offers method : ");
    }
}

public class JAVA_02_abstract_class_example {

    public static void main(String arg[]) {
        // KFC st=new KFC(); <--- Not allowed due to abstract class

        // Below reference are of parent abstract class and objects are of child class
        KFC st1 = new My_KFC1();
        KFC st2 = new My_KFC2();

        st1.make_items();
        st1.billing();
        st1.offers();
        // st1.parking(); < ---- Only parent class methods and overridden methods allowed

        // Below reference and object is created using concrete class
        My_KFC1 st3 =new My_KFC1();

        st3.make_items();
        st3.billing();
        st3.offers();
        st3.parking();
    }

}


// KFC class make_items method : 
// My_KFC1 class billing method : 
// My_KFC1 class offers method :  

// KFC class make_items method :  
// My_KFC1 class billing method : 
// My_KFC1 class offers method :  