// Array copying and modifying

public class JAVA_09_array_02 {

    public static void main(String arg[]) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };

        int arr2[];

        arr2 = arr1;  // Here we are copying elements of 'arr1' to 'arr2'

        System.out.print("Elements of arr1 : ");
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i]++;
        }

        System.out.println();

        System.out.print("Elements of arr1 : ");
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        // from above code out put , we know that 'arr1' and 'arr2' references are pointing to same array.
        // By modifying 'arr2' array , 'arr1' also get modified , because both are refering to same array.

        /////////////////////////////////////////////////////////

        arr1 = null; // here we can refer 'arr1' reference to 'null'

        // if we assign 'null' value to reference of array and there is no reference to that array ,
        // then that array will get collected by garbage collector.

    }
}

// Elements of arr1 : 1 2 3 4 5 6
// Elements of arr1 : 2 3 4 5 6 7