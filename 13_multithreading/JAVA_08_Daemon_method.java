
// In this program we choose 't1' thread as least priority thread ,
// It means only main thread have priority , so if main thread program terminted,
// then overall program will get terminated and 't1' thread will not get executed


class Test extends Thread {

    public void run() {
        int i = 0;

        while (true) {

            System.out.println("welcome "+i++);
        }
    }
}

public class JAVA_08_Daemon_method {

    public static void main(String[] args) {

        Test t1 = new Test();

        // Setting t1 thread as low priority thread
        t1.setDaemon(true);
        t1.start();


        // 'main' Method will sleep according to following Thread.sleep() method before terminating
        try {

            Thread.sleep(10);
        } 
        
        catch (InterruptedException e) {

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
// welcome 11