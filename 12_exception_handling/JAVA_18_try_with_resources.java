import java.io.*;
import java.util.*;

public class JAVA_18_try_with_resources {

    static void fun2() throws Exception {

        // try-with-resourses block, take care of reserving and releasing resources.
        // There is no need to write finally block when we are using try-with-resources block ,
        // it will take care of releasing resources
        try(FileInputStream fi = new FileInputStream("my_file.txt") ; Scanner sc = new Scanner(fi);) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(b / d);
            System.out.println(a / c);
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
// Exception java.lang.ArithmeticException: / by zero