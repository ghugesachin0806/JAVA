public class JAVA_03_multiple_catch_blocks {

    public static void main(String[] args) {

        int A[] = { 0, 10, 20, 30, 40, 50 };

        try {

            int c = A[2] / A[1];
            System.out.println("The result is : " + c);

            // If there is runtime error in above code, below code will not be executed

            // Accessing out of array element error
            System.out.println("The array element is : " + A[10]);

        }

        catch (ArithmeticException e) {

            System.out.println("The Arthmetic exception occurred : ");
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException t) {

            System.out.println("Array index is invalid : ");
            System.out.println(t);

        }

        finally {

            System.out.println("Finally block : ");
        }

        System.out.println("Program executed successfully : ");
    }
}


// The result is : 2

// Array index is invalid : 
// java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

// Finally block : 

// Program executed successfully : 