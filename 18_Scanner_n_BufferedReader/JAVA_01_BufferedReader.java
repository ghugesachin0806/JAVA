import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JAVA_01_BufferedReader {

    public static void main(String[] args) throws IOException {

        int temp1;
        int temp2;
        int sum;

        System.out.println("Enter the Integers : ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        temp1 = Integer.parseInt(br.readLine());
        temp2 = Integer.parseInt(br.readLine());

        sum = temp1 + temp2;

        System.out.println("Sum is  " + sum);

    }

}

// Enter the Integers : 
// 45
// 56
// Sum is  101