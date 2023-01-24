// import java.lang.*;

public class JAVA_02_intro_02 {
    public static void main(String arg[]) {
        
        // ternary operator
        int n = 9;

        int result = (n % 2 == 0) ? 10 : 20;

        System.out.println(result);

        ////////////////////////////////////////////////////

        // simple (if, else ,else if) statements
        int x = 10;
        int y = 20;
        int z = 3;

        if (x > y && x > z) 
        {
            System.out.println(x);
        } 
        else if (y > x && y > z) 
        {
            System.out.println(y);
        } 
        else 
        {
            System.out.println(z);
        }

    }
}

// 20