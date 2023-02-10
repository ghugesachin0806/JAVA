public class JAVA_16_finally_other_methods {

    static void fun1(int a, int b) throws Exception {

        // Here exception is passed to calling function after executing finally block
        try {

            if (b == 0)
                throw new Exception("Exception manually generated !! ");
        }

        // finally block got executed whether exception is occured or not in 'try' block
        finally {

            System.out.println("Finally block ");
        }

        System.out.println("fun1() block : ");
    }

    static void fun2() {

        try {

            fun1(10, 0);
        }

        catch (Exception et) {

            System.out.println(et);
        }

        System.out.println("fun2() block : ");
    }

    public static void main(String[] args) {

        fun2();
        System.out.println("main block : ");
    }
}

// Finally block 
// java.lang.Exception: Exception manually generated !! 
// fun2() block : 
// main block : 