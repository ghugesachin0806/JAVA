
public class JAVA_01_exception_handling_intro {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c;

        try {

            c = a / b;
            System.out.println("The value of c is " + c);

        }

        catch (ArithmeticException e) {

            System.out.println("The equation is divisible by zero : ");
            System.out.println(e);

        }

        System.out.println("1st Program executed successfully : ");

    }
}
