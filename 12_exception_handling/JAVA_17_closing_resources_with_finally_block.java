import java.io.*;
import java.util.*;

public class JAVA_17_closing_resources_with_finally_block {

    // static references
    static FileInputStream fi;
    static Scanner sc;

    static void fun2() throws Exception {

        // Resource reserved
        fi = new FileInputStream("my_file.txt");
        sc = new Scanner(fi);

        try {

            // Resources are getting used
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(b / d);
            System.out.println(a / c); // Runtime exception occurred here
        }

        finally {

            // Finally block generally used to close the resources , irrespective of exception and its handling

            // Resources are getting close using finally block
            fi.close();
            sc.close();

            System.out.println("finally block get executed : ");
        }
    }

    public static void main(String[] args) {

        try {

            fun2();
        }

        catch (Exception et) {
            System.out.println("Exception " + et);

        }

    }
}

// 0
// finally block get executed : 
// Exception java.lang.ArithmeticException: / by zero