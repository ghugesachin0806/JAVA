public class JAVA_07_exception_flow {

    static void fun1() {

        int a = 10;
        int b = 0;
        int c = a / b;  // Exception will be occurred here, it will check for try-catch block,
        // If try-catch block is not there , then it this exception will be passed to calling function,
        // if calling function don't have try-catch block ,then exception will continuously passed to calling functions till
        // it gets JVM or try-catch block in calling function's chain.

        System.out.println("The value of c: " + c);
        System.out.println("fun1() block : ");


    }

    static void fun2() {

        fun1();
        System.out.println("fun2() block : ");

    }

    static void fun3() {

        fun2();
        System.out.println("fun3() block : ");

    }

    public static void main(String[] args) {

        fun3();
        System.out.println("main block : ");

    }
}


// Below exception is passed till JVM due to lack of try-catch block

// Exception in thread "main" java.lang.ArithmeticException: / by zero   
//         at JAVA_07_exception_flow.fun1(JAVA_07_exception_flow.java:7) 
//         at JAVA_07_exception_flow.fun2(JAVA_07_exception_flow.java:20)
//         at JAVA_07_exception_flow.fun3(JAVA_07_exception_flow.java:27)
//         at JAVA_07_exception_flow.main(JAVA_07_exception_flow.java:34)