
class Test extends Thread
{
    // constructor overloading
    public Test(String name)
    {
        
        // passing string to parent(Thread) class using 'super' keyword
        super(name);

        // Three priorities available 
        // setPriority(Thread.MAX_PRIORITY);
        // setPriority(Thread.MIN_PRIORITY);
        // setPriority(Thread.NORM_PRIORITY);
    }
}


public class JAVA_06_Thread_class_constructors_n_methods {

    public static void main(String[] args)
    {
        
        // passing string to thread
        Test t1 = new Test("t1 thread ");

        t1.setPriority(9); // Setting priority to thread 

        // Thread class methods
        System.out.println("NAME: "+t1.getName());
        System.out.println("PRIORITY : "+t1.getPriority());
        System.out.println("STATE : "+t1.getState());
        t1.start();
        System.out.println("PRIORITY : "+t1.getPriority());
        System.out.println("STATE : "+t1.getState());
        System.out.println("Alive : "+t1.isAlive());
    }
    
}

// NAME: t1 thread 
// PRIORITY : 9      
// STATE : NEW       
// PRIORITY : 9      
// STATE : TERMINATED
// Alive : false  