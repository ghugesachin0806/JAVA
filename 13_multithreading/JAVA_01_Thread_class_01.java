
// 'Test' class extending from Thread class
class Test extends Thread {

    // run() method is starting point of thread 
    public void run() // overrides the run() method available in the Thread class
    {
        int i = 1;
        while (i < 50) {

            System.out.println("Extended thread class : ");
            i++;
        }
    }
}

public class JAVA_01_Thread_class_01 {

    public static void main(String[] args) {

        Test t1 = new Test();  // Thread object created

        // Start() invokes the run() method on the Thread object
        t1.start(); // start() method to start the execution of a thread

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
// Extended thread class :
// Main class :
// Main class :
// Extended thread class :
// Main class :
// Main class :
// Main class :
// Main class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Main class :
// Extended thread class :
// Extended thread class :
// Main class :
// Extended thread class :
// Extended thread class :
// Main class :
// Extended thread class :
// Main class :
// Main class :
// Main class :
// Extended thread class :
// Extended thread class :
// Main class :
// Extended thread class :
// Main class :
// Main class :
// Main class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Main class :
// Main class :
// Main class :
// Extended thread class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Extended thread class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Main class :
// Extended thread class :
// Main class :
// Main class :
// Main class :
// Main class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :
// Extended thread class :