
// Synchronizing threads using synchronization block

class MyData {

    public void display(String name) {

        // critical section
        // Synchronized block to synchronized incoming threads
        synchronized (this) {

            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i));
            }

            System.out.print("\n");
        }
    }

}

class MyThread1 extends Thread
{
    public MyData d1;

    // constructor
    public MyThread1(MyData d1)
    {
        this.d1=d1;
    }

    // run() method is starting point of thread
    public void run()
    {
        d1.display("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

}

class MyThread2 extends Thread
{
    public MyData d2;

    // constructor
    public MyThread2(MyData d2)
    {
        this.d2=d2;
    }

    // run() method is starting point of thread
    public void run()
    {
        d2.display("+++++++++++++++++++++++++++++++++++++++++");
    }

}

public class JAVA_11_Synchronizing_threads_using_Synchronization_block {

    public static void main(String[] args) {

        MyData th; // Creating reference for MyData class's object
        th= new MyData();

        // passing Single Object(Resource) to Two threads at same time 
        MyThread1 t1 = new MyThread1(th);
        MyThread2 t2 = new MyThread2(th);

        // Starting two threads
        t1.start();
        t2.start();

    }
}


// WITH Synchronized block
// +++++++++++++++++++++++++++++++++++++++++   
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

// WITHOUT Synchronized block
// +++++++++++++++++++++++++++++++++++++XXXXXXXXXXXXXXX++++XXXXXXXXXXXXXX
// XXXXXXXXXXXXXXX