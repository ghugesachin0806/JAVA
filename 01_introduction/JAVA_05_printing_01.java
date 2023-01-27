public class JAVA_05_printing_01 {

    public static void main(String arg[]) {
        
        String str = "HELLO";

        System.out.println(str);

        // following result is different

        int x = 10;
        int y = 20;

        System.out.println(x + y);

        System.out.println(x + y + " sum"); // first sum is done , then concatenation is performed

        System.out.println("sum " + x + y); // first concatenation is done throughout the statement

        System.out.println("sum " + (x + y));

        System.out.println("sum of " + x + " and " + y + " is " + (x + y));
    }
}

// HELLO
// 30
// 30 sum
// sum 1020
// sum 30
// sum of 10 and 20 is 30