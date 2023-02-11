
// Creating thread class's 'Run()' method inside the class

public class JAVA_02_Thread_class_02 extends Thread // the class itself is extened from thread
{

    // run() method is starting point of thread
    public void run() // overrides the run() method available in the Thread class
    {
        int i = 1;
        while (i < 50) { 

            System.out.println("Run Method ----->>>>>>: ");
            i++;
        }
    }

    public static void main(String[] args) {

        JAVA_02_Thread_class_02 t1 = new JAVA_02_Thread_class_02(); // Thread object created

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
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Main class :
// Main class :
// Main class :
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Main class :
// Main class :
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Main class :
// Run Method ----->>>>>>:
// Main class :
// Main class :
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Main class :
// Run Method ----->>>>>>:
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Main class :
// Run Method ----->>>>>>:
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Main class :
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>:
// Run Method ----->>>>>>: