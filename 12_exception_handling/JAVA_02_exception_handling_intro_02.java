// Exception handling by taking inputs from user

import java.util.*;  // package to take inputs from user

public class JAVA_02_exception_handling_intro_02 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner st = new Scanner(System.in);

        System.out.print("Enter the two numbers :");

        a=st.nextInt();
        b=st.nextInt();

        try {

            c = a / b;
            System.out.println("The value of c is " + c);

        }

        catch (ArithmeticException e) {

            System.out.println("The equation is divisible by zero : ");
            System.out.println(e);

        }

        System.out.println("1st Program executed successfully : ");
    }
}

// Enter the two numbers :10 5
// The value of c is 2
// 1st Program executed successfully : 

// Enter the two numbers :10 0
// The equation is divisible by zero : 
// java.lang.ArithmeticException: / by zero
// 1st Program executed successfully :