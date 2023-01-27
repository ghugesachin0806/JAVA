public class JAVA_07_strings_02 {
    public static void main(String arg[]) {

        String str = "JAVA";

        int l = str.length();

        System.out.println("length is " + l);

        /////////////////////////////////////////////////////////////////////

        // In java, objects of String are immutable which means a constant and cannot be
        // changed once created.

        String str1 = "JAVA_IS_BEST";

        String str2 = str1.toLowerCase(); // Here new string is created using 'str1' string and it is stored in 'str2'
                                          // Here the imp point is that 'str1' will not get changed

        System.out.println(str2); // new manipulated string

        System.out.println(str1); // old string remain as it is .

        /////////////////////////////////////////////////////////////////////

        // we can assign 'str1' reference to newly created string

        System.out.println(str1); // 'str1' reference pointer is pointing to "JAVA_IS_BEST" object

        str1 = str1.toLowerCase(); // this statement will create new string using 'str1' and assign it to 'str1'
                                   // reference

        System.out.println(str1); // Here modified 'str1' will get printed
    }
}

// length is 4

// java_is_best
// JAVA_IS_BEST

// JAVA_IS_BEST
// java_is_best