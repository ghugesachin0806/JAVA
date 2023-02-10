public class JAVA_15_finally_block_02 {

    public static void main(String[] args) {

        try {

            System.out.println(10 / 0);
        }

        catch (ArithmeticException et) {

            System.out.println(et);
        }

        // finally block got executed whether exception is occured or not in 'try' block
        finally {

            System.out.println("Finally block : ");
        }

        // Below statement will get executed after finally block , 
        // because exception is caught in catch block , it is not get passed to calling method
        System.out.println("Program executed successfully !!");
    }
}

// java.lang.ArithmeticException: / by zero
// Finally block : 
// Program executed successfully !!