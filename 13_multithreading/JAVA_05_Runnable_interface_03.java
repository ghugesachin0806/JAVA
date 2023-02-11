
// Test class implements Runnable interface
class Test implements Runnable
{

    // run() method is starting point of thread 
    public void run() // overrides the run() method available in the Runnable interface
    {
        int i = 1;
        while (i < 50) {

            System.out.println("Implementing Runnable interface : ");
            i++;
        }
    }
}


public class JAVA_05_Runnable_interface_03 {
    
    public static void main(String[] args) {
        

        // Directly passing object of class which implements interface , without creating reference of that object
        Thread t1 = new Thread(new Test());

        // Start() invokes the run() method on the Thread object along with that 'obj1' object also runs.
        t1.start();

        int i = 1;

        while (i < 50) {

            System.out.println("Main class : ");
            i++;
        }
    }
}

// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class : 
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface : 
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :
// Implementing Runnable interface :