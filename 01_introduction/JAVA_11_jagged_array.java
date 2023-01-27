public class JAVA_11_jagged_array {
    public static void main(String arg[]) {
        // Jagged array - which has different size rows

        // creating jagged array

        int arr[][];

        arr = new int[4][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[7];
        arr[3] = new int[3];

        // modifying elements of jagged array

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = i * j;
            }
        }

        // traversing through jagged array

        System.out.println("Arr 2D jagged-array elements: ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}

// Arr 2D jagged-array elements:
// 0 0
// 0 1 2
// 0 2 4 6 8 10 12
// 0 3 6