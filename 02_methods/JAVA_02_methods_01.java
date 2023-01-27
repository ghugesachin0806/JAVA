
// Calling the method with object

import java.util.*;

public class JAVA_02_methods_01 {

    int max(int x, int y) {

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

        JAVA_02_methods_01 obj1 = new JAVA_02_methods_01(); // Object is created

        c = obj1.max(a, b); // Method is called using object

        System.out.print("Max element is " + c);
    }

}

// Enter the elements :
// 10
// 20
// Max element is 20
