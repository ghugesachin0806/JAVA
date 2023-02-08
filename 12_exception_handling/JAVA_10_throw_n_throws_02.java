public class JAVA_10_throw_n_throws_02 {

    static int fun1(int a, int b) throws Exception {

        if (b == 0)
            throw new Exception("b can't be zero ");

        System.out.println("fun1() block : ");

        int c = a / b;
        return c;

    }

    static void fun2() throws Exception {

        int temp = fun1(10, 0);  // received exception will be passed to calling function

        System.out.println("fun2() block : ");

    }

    static void fun3() {
        try {

            fun2(); // received exception will be passed to catch block
        }

        catch (Exception et) {

            System.out.println(et);
            System.out.println("fun3() block : ");

        }
    }

    public static void main(String[] args) {

        fun3();
        System.out.println("main block : ");

        
    }
}



// java.lang.Exception: b can't be zero 
// fun3() block : 
// main block :