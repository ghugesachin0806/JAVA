public class JAVA_03_passing_object_as_parameter {

    static void update(int[] arr1) {

        arr1[0] = 25;
    }

    public static void main(String[] arg) {

        int[] arr = { 10, 20, 30, 50 };

        update(arr);

        System.out.print(arr[0]);
    }
}

// 25