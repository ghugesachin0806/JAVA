// import java.lang.*; // basic package of java

import java.util.*; // this package is used for reading data from the keyboard

public class JAVA_04_intro_04 {
    public static void main(String arg[]) {

        Scanner st = new Scanner(System.in); // for taking data from keyboard

        int a, b, c;
        int result;

        System.out.println("Enter the numbers : ");

        // for reading integers data from keyboard

        a = st.nextInt();
        b = st.nextInt();
        c = st.nextInt();

        result = a + b + c;

        System.out.println("sum is " + result);

        // Reading string from keyboard

        String str;

        System.out.print("Enter the name  :");

        str = st.next();

        System.out.println("welcome " + str);

        // Taking binary input

        Scanner stp = new Scanner(System.in);

        // FOR Taking binary input and converting it into integer
        
        stp.useRadix(2);

        int x;

        x = stp.nextInt();

        System.out.println("Number : " + x);

    }

}

// Enter the numbers : 
// 41 45 56
// sum is 142     

// Enter the name  :sachin
// welcome sachin

// 10101
// Number : 21