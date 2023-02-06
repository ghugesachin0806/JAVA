import java.nio.channels.NetworkChannel;

class Test
{
    // There are three ways to initialize final variable 
    // 1. directly
    // 2. Inside constructor
    // 3. Inside static block (only static final)

    // Generally final variables are written in capital letters

    final int AB=10;      // 1st way
    final static int BC;
    final int CD;

    static{

        BC=90;  // 2nd way
    }

    // constructor
    public Test()
    {
        CD=78; // 3rd way
    }

    final void display() // this method cannot be override 
    {
        System.out.println("This method cannot be overridde : ");
    }
}

final class Train  // This class cannot be extend further for inheritance
{

    void display()
    {
        System.out.println("This method cannot be overridde : ");
    }
}


public class JAVA_03_final_keyword {

    public static void main(String[] args) {
        
        Test t1 = new Test();

        t1.display();
    }
    
}


// This method cannot be overridde :