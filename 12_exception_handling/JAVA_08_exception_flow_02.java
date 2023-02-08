
// when Exception will be occurred here, it will check for try-catch block,
// If try-catch block is not there , then it this exception will be passed to calling function,
// if calling function don't have try-catch block ,then exception will continuously passed to calling functions till
// it gets JVM or try-catch block in between calling function's chain.

public class JAVA_08_exception_flow_02 {

    static void fun0() {
        int a = 10;
        int b = 0;
        int c = a / b;

        System.out.println("The value of c: " + c);
        System.out.println("fun1() block : ");
    }

    static void fun1() {

        fun0();
        System.out.println("fun1() block : ");
    }

    static void fun2() {

        fun1();
        System.out.println("fun2() block : ");
    }

    static void fun3() {
        try {

            fun2();
            System.out.println("fun3() block : ");
        }

        catch (Exception et) {

            System.out.println(et.toString());
        }

    }

    public static void main(String[] args) {

        fun3();
        System.out.println("main block : ");
    }
}

// java.lang.ArithmeticException: / by zero
// main block :