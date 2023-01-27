// Calling method without creating object

// If we not create object and call the method, then method should be static

import java.util.*;

public class JAVA_01_methods_intro {

    static int max(int x, int y) // Here static is written
                                 // Because, main is static and it can only call static methods
    {
        if (x > y)
            return x;

        else
            return y;
    }

    public static void main(String str[]) {
        int a, b, c;

        Scanner st = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        a = st.nextInt();
        b = st.nextInt();

        c = max(a, b);

        System.out.print("Max element is " + c);
    }

}

// Enter the elements :
// 10
// 20
// Max element is 20
