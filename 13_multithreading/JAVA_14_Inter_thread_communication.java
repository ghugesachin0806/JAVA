
// Inter-thread communication between producer and consumer on the same data item

// The wait() method causes the current thread to wait until another thread invokes the notify() or notifyAll() methods for that object. 
// The notify() method wakes up a single thread that is waiting on that object’s monitor. 
// The notifyAll() method wakes up all threads that are waiting on that object’s monitor.
// A thread waits on an object’s monitor by calling one of the wait() method.

class MyData {

    int value;
    boolean flag = true;

    synchronized public void set(int v) {

        // wait uses try-catch block
        while (flag != true)
            try {

                wait();
            }

            catch (Exception e) {
            }

        value = v;
        flag = false;

        notify();
    }

    synchronized public int get() {

        int x = 0;
        while (flag != false)
            // wait uses try-catch block
            try {

                wait();
            }

            catch (Exception e) {
            }

        x = value;
        flag = true;

        notify();

        return x;
    }
}

class Producer extends Thread {

    MyData data;

    public Producer(MyData d) {

        data = d;
    }

    public void run() {

        int count = 1;
        while (true) {

            data.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread {

    MyData data;

    public Consumer(MyData d) {

        data = d;
    }

    public void run() {

        int value;
        while (true) {

            value = data.get();
            System.out.println("Consumer " + value);
        }
    }
}

public class JAVA_14_Inter_thread_communication {
    public static void main(String[] args) {

        //
        MyData data = new MyData();

        // passing Same Object(Resource) to Two threads at same time
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();

    }
}