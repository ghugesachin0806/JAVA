// The sleep() method is a static method of Thread class ,
// and it makes the thread sleep/stop working for a specific amount of time. 
// The sleep() method throws an InterruptedException if a thread is interrupted by other threads, 
// that means Thread.sleep() method must be enclosed within the try and catch blocks or 
// it must be specified with throws clause. 

class Test extends Thread {

    public void run() {
        int i = 1;
        while (i < 11) {
            System.out.println("Test class : ");

            // sleep method throws InterruptedException , so its need try-catch block
            try {

                Thread.sleep(100); // static method of thread class
            }

            catch (InterruptedException e) {

                System.out.println(e);
            }
            i++;
        }
    }
}

public class JAVA_07_Thread_class_sleep_method {

    public static void main(String[] args) {

        Test t1 = new Test();

        t1.start();
        t1.interrupt(); // interrupt method of Thread class
    }
}

// Test class : 
// java.lang.InterruptedException: sleep interrupted
// Test class : 
// Test class : 
// Test class : 
// Test class : 
// Test class : 
// Test class : 
// Test class : 
// Test class : 
// Test class : 