import java.util.Scanner;

public class JAVA_02_Scanner {

    public static void main(String[] args) {
        
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
    }
    
}

// Enter the numbers : 
// 56 52 54
// sum is 162

// Enter the numbers : 
// 56
// 56
// 52
// sum is 164