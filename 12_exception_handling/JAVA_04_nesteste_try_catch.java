public class JAVA_04_nesteste_try_catch {

    public static void main(String[] args) {

        int A[] = { 0, 10, 20, 30, 40, 50 };

        //////////////// nested try-catch block ////////////////////////
        try {

            try {
                int c = A[2] / A[0];
                System.out.println("The result is : " + c);
            }

            catch (ArithmeticException e) {
                System.out.println("The Arthmetic exception occurred : ");
                System.out.println(e);
            }

            System.out.println("The array element is : " + A[10]);

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


// The Arthmetic exception occurred : 
// java.lang.ArithmeticException: / by zero

// Array index is invalid : 
// java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

// Finally block : 

// Program executed successfully :