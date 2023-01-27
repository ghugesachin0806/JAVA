
public class JAVA_04_method_overloading {

    // static int max(int x, int y) {
    // return x > y ? x : y;
    // }

    // This method can work for float as well as int data types
    static float max(float x, float y) {
        return x > y ? x : y;
    }

    static int max(int x, int y, int z) {
        int m = x > y ? x : y;

        return m > z ? m : z;
    }

    public static void main(String[] arg) {

        System.out.println("Max value is " + max(10, 20)); // if int method not given then float method will be called

        System.out.println("Max value is " + max(10.12f, 20.3f));

        System.out.println("Max value is " + max(10, 20.13f)); // float method will be called

        System.out.println("Max value is " + max(10, 25, 11));

    }

}

// Max value is 20.0
// Max value is 20.3
// Max value is 20.13
// Max value is 25