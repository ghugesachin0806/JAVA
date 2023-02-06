class Test
{
    static int a=10;
    int b=20;

    // first static block
    static 
    {
        System.out.println("The static variable of class : "+a);
    }

    // second static block
    static 
    {
        System.out.println("The second static block : ");
    }
}


public class JAVA_02_static_block {

    public static void main(String[] args) {

        // static blocks of class is executed only once, the first time the class is loaded into memory. 

        Test t1 = new Test(); // static blocks of Test class are called here

        System.out.println("The main method() is called : ");

        // creating second object of same class
        Test t2 = new Test(); // static blocks are called only once, so no static blockas will be called
        
    }
    
    static
    {
        System.out.println("main method's class's static block executed : ");
    }
}

// main method's class's static block executed : 

// The static variable of class : 10
// The second static block :        

// The main method() is called :  