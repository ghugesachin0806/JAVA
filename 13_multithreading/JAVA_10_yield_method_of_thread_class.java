
// The yield() method of thread class causes the currently executing thread object to temporarily pause ,
// and allow other threads to execute.

class Test extends Thread {

    public void run() {
        int i = 0;

        while (true) {

            System.out.println("Test thread :" + i++);
        }
    }
}

public class JAVA_10_yield_method_of_thread_class {

    public static void main(String[] args) {

        Test t1 = new Test();

        t1.start();

        int i = 0;

        while (true) {

            System.out.println("Main thread :" + i++);

            Thread.yield(); // Static method of Thread class
            // yield method will temporary pause and allow other threads to execute
        }
    }
}
