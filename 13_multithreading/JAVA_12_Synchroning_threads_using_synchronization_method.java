
// Synchronizing threads using synchronization method 


class MyData {

    // critical section
    // Synchronized method to synchronized incoming threads
    synchronized void display(String name) {


            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i));
            }

            System.out.print("\n");
        
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

public class JAVA_12_Synchroning_threads_using_synchronization_method {

    public static void main(String[] args) {

        MyData th; // Creating reference for MyData class's object
        th= new MyData();

        // passing Same Object(Resource) to Two threads at same time 
        MyThread1 t1 = new MyThread1(th);
        MyThread2 t2 = new MyThread2(th);

        // Starting two threads
        t1.start();
        t2.start();

    }
}


// WITH Synchronized method
// +++++++++++++++++++++++++++++++++++++++++   
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

// WITHOUT Synchronized block
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX+++++++XXXXXXXXX++
// ++++++++++++++++++++++++++++++++