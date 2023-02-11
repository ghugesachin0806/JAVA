
// Teacher ,student and Whiteboard

class WhiteBoard {

    String text;
    int numberOfStudents = 0;
    int count = 0;

    public void attendance() {

        numberOfStudents++;
    }

    synchronized public void write(String t) {

        System.out.println("Teacher is Writing " + t);
        while (count != 0)
            try {

                wait();
            } catch (Exception e) {

            }

        text = t;
        count = numberOfStudents;
        notifyAll();

    }

    synchronized public String read() {

        while (count == 0)
            try {

                wait();
            } catch (Exception e) {
            }

        String t = text;
        count--;
        if (count == 0)
            notify();
        return t;
    }

}

class Teacher extends Thread {
    WhiteBoard wb;

    String notes[] = { "Java is language", "It is OOPs", "It is Platform Independent", "It supports Thread", "end" };

    public Teacher(WhiteBoard w) {

        wb = w;
    }

    public void run() {

        for (int i = 0; i < notes.length; i++)
            wb.write(notes[i]);
    }

}

class Student extends Thread {

    String name;
    WhiteBoard wb;

    public Student(String n, WhiteBoard w) {

        name = n;
        wb = w;
    }

    public void run() {

        String text;
        wb.attendance();

        do {

            text = wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush(); // to flush the output (optional)
        } while (!text.equals("end"));
    }

}

public class JAVA_15_Inter_thread_communication_example {
    public static void main(String[] args) {

        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. John", wb);
        Student s2 = new Student("2. Ajay", wb);
        Student s3 = new Student("3. Kloob", wb);
        Student s4 = new Student("4. Smith", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}

// Teacher is Writing Java is language
// Teacher is Writing It is OOPs
// Teacher is Writing It is Platform Independent
// 3. Kloob Reading Java is language
// 3. Kloob Reading It is OOPs
// 4. Smith Reading Java is language
// 1. John Reading Java is language
// 2. Ajay Reading Java is language
// 3. Kloob Reading It is OOPs
// 4. Smith Reading It is OOPs
// 1. John Reading It is OOPs
// Teacher is Writing It supports Thread
// 1. John Reading It is Platform Independent
// 4. Smith Reading It is Platform Independent
// 3. Kloob Reading It is Platform Independent
// 2. Ajay Reading It is Platform Independent
// Teacher is Writing end
// 3. Kloob Reading It supports Thread
// 2. Ajay Reading It supports Thread
// 4. Smith Reading It supports Thread
// 1. John Reading It supports Thread
// 3. Kloob Reading end
// 2. Ajay Reading end
// 4. Smith Reading end
// 1. John Reading end