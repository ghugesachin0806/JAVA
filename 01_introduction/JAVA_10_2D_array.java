public class JAVA_10_2D_array {
    public static void main(String arg[]) {

        // defining 2d array

        int arr1[][] = new int[3][4];

        int arr2[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 }, { 10, 20, 30 } };

        // Accessing 2D arrays using for loop

        System.out.println("arr1 elements : ");

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                System.out.print(arr1[i][j] + " ");
            }

            System.out.println("\n");
        }

        System.out.println("arr2 elements : ");

        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                System.out.print(arr2[i][j] + " ");
            }

            System.out.println("\n");
        }

        //////////////////////////////////////////////////////////////////////////

        // Accessing 2D arrays using 'for each loop'
        // Give attention in below code

        System.out.println("arr1 elements : ");

        for (int x[] : arr1) {

            for (int y : x) {

                System.out.print(y + " ");
            }

            System.out.println("\n");
        }

        System.out.println("arr2 elements : ");

        for (int x[] : arr2) {

            for (int y : x) {

                System.out.print(y + " ");
            }

            System.out.println("\n");
        }

    }
}

// arr1 elements :
// 0 0 0 0

// 0 0 0 0

// 0 0 0 0

// arr2 elements :
// 11 22 33

// 44 55 66

// 77 88 99

// 10 20 30

// arr1 elements :
// 0 0 0 0

// 0 0 0 0

// 0 0 0 0

// arr2 elements :
// 11 22 33

// 44 55 66

// 77 88 99

// 10 20 30