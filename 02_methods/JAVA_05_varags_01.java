// Variable arguments

public class JAVA_05_varags_01 {

    // Below variable arguments are passed to 'show' method using '(int... var)' declaration.
    static void show(int... var) {

        // One way

        System.out.print("arguments are passed : ");

        for (int i : var) {

            System.out.print(i + " ");

        }

        System.out.println();

        // Another way

        System.out.print("arguments are passed : ");

        for (int i = 0; i < var.length; i++) {

            System.out.print(var[i] + " ");

        }

        System.out.println();

    }

    public static void main(String arg[]) {

        show();
        show(10, 20);
        show(40, 11, 22);
        show(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // Below we pass anonymous array to variable argument array
        show(new int[] { 33, 55, 77, 88 });

    }

}

// arguments are passed : 
// arguments are passed : 

// arguments are passed : 10 20 
// arguments are passed : 10 20 

// arguments are passed : 40 11 22 
// arguments are passed : 40 11 22 

// arguments are passed : 1 2 3 4 5 6 7 8 9 
// arguments are passed : 1 2 3 4 5 6 7 8 9 

// arguments are passed : 33 55 77 88       
// arguments are passed : 33 55 77 88     