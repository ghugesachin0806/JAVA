class Test {

    public int max(int x, int y) {

        return x > y ? x : y;
    }

    public int max(int x, int y, int z) {

        int m = x > y ? x : y;
        return m > z ? m : z;
    }
}

public class JAVA_01_compile_time_poly {

    public static void main(String arg[]) {
        Test t1 = new Test();

        int temp1 = t1.max(88, 99);
        int temp2 = t1.max(11, 22, 33);

        System.out.println("Max. value of two int : " + temp1);
        System.out.println("Max. value of three int : " + temp2);
    }

}

// Max. value of two int : 99
// Max. value of three int : 33