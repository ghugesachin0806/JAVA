// Command line arguments

public class JAVA_07_commandLine_argument {
    public static void main(String arg[]) {

        // One way

        System.out.print("1. Command line arg : ");

        for (String str : arg) {

            System.out.print(str + " ");
        }

        System.out.print("\n");

        ////////////////////////////////////////////////////////

        // Another way

        System.out.print("2. Command line arg : ");

        for (int i = 0; i < arg.length; i++) {

            System.out.print(arg[i] + " ");
        }
    }
}

// Teminal --> java JAVA_07_commandLine_argument Hello how are you

// 1. Command line arg : Hello how are you
// 2. Command line arg : Hello how are you