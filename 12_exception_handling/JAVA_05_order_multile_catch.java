// while handling multiple catch blocks, make sure that you are specifing exception sub classes first,
//  then followed by exception super classes. Otherwise we will get compile time error.

// If multiple catch blocks are placed in hierarchical order then,
// If sub-class catch block is related to that exception it will execute its block and 
// then its hierarchical superclass catch block will not handle that exception.

public class JAVA_05_order_multile_catch {

    public static void main(String[] args) {

        int A[] = { 0, 10, 20, 30, 40, 50 };

        try {

            int c = A[2] / A[0];
            System.out.println("The result is : " + c);
            System.out.println(A[11]);
        }

        // sub-class catch block
        catch (ArithmeticException e) {

            System.out.println("ArthmeticException block : ");
            System.out.println(e);
        }

        // super class catch block
        catch (Exception t)  // if subclass of this catches exception , then this block will not execute
        {

            System.out.println("Exception block : ");
            System.out.println(t);

        }
    }
}

// ArthmeticException block : 
// java.lang.ArithmeticException: / by zero