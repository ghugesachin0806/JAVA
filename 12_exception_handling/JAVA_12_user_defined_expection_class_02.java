// User-defined exception 


class UserException extends Exception {

    @Override // optional to write @override
    public String toString() {

        return "User-defined Exception class's toString method()";
    }
}

public class JAVA_12_user_defined_expection_class_02 {

    static void fun1(int a, int b) throws UserException {

        if (b == 0)
            throw new UserException();

        int c = a / b;
        System.out.println("The value of c: " + c);

        System.out.println("fun1() block : ");

    }

    static void fun2() {

        try {

            fun1(10, 0); // received exception will be passed to catch block
        }

        catch (UserException et) {

            System.out.println(et.toString());
        }

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

// User-defined Exception class's toString method()
// fun2() block : 
// fun3() block : 
// main block : 