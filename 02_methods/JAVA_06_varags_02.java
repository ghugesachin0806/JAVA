
public class JAVA_06_varags_02 {

    static void show(String... str) {

        System.out.print("Strings are : ");

        for (int i = 0; i < str.length; i++) {

            System.out.print((i + 1) + "." + str[i] + " ");
        }

        System.out.print("\n");
    }

    public static void main(String arg[]) // public static void main(String ...arg ) <--- This is allowed
    {

        show("john", "smith", "ram");
        show("jack");
        show();
        show("ram", "sham", "soham", "laxman");
    }

}

// Strings are : 1.john 2.smith 3.ram
// Strings are : 1.jack
// Strings are :
// Strings are : 1.ram 2.sham 3.soham 4.laxman