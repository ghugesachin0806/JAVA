public class JAVA_14_finally_block {

    public static void main(String[] args) {
        
        try{

            System.out.println(10/0);
        }

        // finally block got executed whether exception is occured or not in 'try' block
        finally{

            System.out.println("Finally block : ");
        }

        // Below statement will not get executed , 
        //because exception is passed to calling method after finally block got executed
        System.out.println("Program executed successfully !!");

    }
}


// Finally block : 
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at JAVA_14_finally_block.main(JAVA_14_finally_block.java:7)