
// the join() method which allows one thread to wait until another thread completes its execution. 


class Test extends Thread {

    public void run() {
        int i = 0;

        while (i<11) {

            System.out.println("welcome " + i++);
        }
    }
}

public class JAVA_09_Join_method_of_thread_class {

    public static void main(String[] args) {

        Test t1 = new Test();

        // Setting t1 thread as low priority thread
        t1.setDaemon(true);
        t1.start();

        // before 't1' thread is not Daemon thread , 'main' thread is automatically join() ,
        // but due to setting 't1' thread as Daemon thread, main thread will not join and terminates whole program ,
        // without waiting for 't1' thread

        // creating current 'Thread' reference
        Thread mainThread = Thread.currentThread();

        try {

            mainThread.join(); // Now 'main' Thread will wait to finish all other running Threads
        }

        catch (InterruptedException e) {

            System.out.println(e);
        }

    }
}


// welcome 0
// welcome 1 
// welcome 2 
// welcome 3 
// welcome 4 
// welcome 5 
// welcome 6 
// welcome 7 
// welcome 8 
// welcome 9 
// welcome 10