public class JAVA_08_array_01 {
    public static void main(String arg[]) {
        // There are two ways of creating array in HEAP memory

        int arr1[] = new int[5]; // This Array will be created in HEAP memory

        int arr2[] = { 2, 4, 6, 7, 9, 10 }; // same here ,this Array will be created in HEAP memory

        // This is another way of creating array in Heap memory
        int arr3[];
        arr3 = new int[7];

        // along with array elements , it has in-build 'length' object property

        System.out.println("length of arr1 " + arr1.length);

        System.out.println("length of arr2 " + arr2.length);

        System.out.println("length of arr2 " + arr3.length);

        // modifying array elements

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * i;
        }

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i * i * i;
        }

        // Accessing array elements

        System.out.print("The elements of arr1 are :");

        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n");

        System.out.print("The elements of arr3 are :");

        for (int i = 0; i < arr3.length; i++) {

            System.out.print(arr3[i] + " ");
        }

        System.out.println("\n");

        ///////////////////////////////////////////////////////////////////////

        // using 'for each loop'

        // In 'for each loop ' values of array's get copied into 'x' variable orderly.

        System.out.print("The elements of arr2 are :");

        for (int x : arr2) // 'for each loop ' is used here
        {
            System.out.print(x + " ");
        }

    }
}

// length of arr1 5
// length of arr2 6
// length of arr2 7

// The elements of arr1 are :0 1 4 9 16

// The elements of arr3 are :0 1 8 27 64 125 216

// The elements of arr2 are :2 4 6 7 9 10