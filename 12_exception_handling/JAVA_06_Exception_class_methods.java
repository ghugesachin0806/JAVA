public class JAVA_06_Exception_class_methods {

    static void fun1()
    {
        try
        {
            int a=10;
            int b=0;

            int c=a/b;
        }

        catch(Exception et)
        {
            // Exception class Methods

            // 1. getMessage() method of Exception class
            System.out.println(et.getMessage());

            // 2. toString() method of Exception class
            System.out.println(et.toString());

            System.out.println(et); // It internally uses toString() method

            // 3. printStackTrace() method of Exception class
            et.printStackTrace();

        }
    }
    
    static void fun2()
    {
        fun1();
    }

    static void fun3()
    {
        fun2();
    }
    public static void main(String[] args) {
        
        fun3();
    }
}

// 1. / by zero

// 2. java.lang.ArithmeticException: / by zero

// java.lang.ArithmeticException: / by zero

// 3. java.lang.ArithmeticException: / by zero
//         at JAVA_06_Exception_class_methods.fun1(JAVA_06_Exception_class_methods.java:10)
//         at JAVA_06_Exception_class_methods.fun2(JAVA_06_Exception_class_methods.java:31)
//         at JAVA_06_Exception_class_methods.fun3(JAVA_06_Exception_class_methods.java:36)
//         at JAVA_06_Exception_class_methods.main(JAVA_06_Exception_class_methods.java:40)