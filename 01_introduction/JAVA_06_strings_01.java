public class JAVA_06_strings_01 {

    public static void main(String arg[]) {

        char c[] = { 'A', 'B', 'C', 'D' };

        String str = new String(c);

        byte b[] = { 68, 69, 70 };

        String str3 = new String(b);

        System.out.println(str);

        System.out.println(str3);

        ////////////////////////////////////////////////////////////////////////////

        String str1 = "Python"; // this literal is stored in (string Pool)

        String str2 = new String("JAVA"); // this object is created in (JAVA Heap) and as literal in (String Pool)

        System.out.println(str1);

        System.out.println(str2);

        /////////////////////////////////////////////////////////////////////////////

        String str5 = "JAVA";

        String str6 = "JAVA";

        String str7 = "java";

        String str8 = new String("JAVA");

        String str9 = new String("JAVA");

        System.out.println(str5 == str6); // both literals are same ,so they are pointing to same literal in (String
                                          // pool)

        System.out.println(str6 == str7); // literal are different

        System.out.println(str6 == str8); // str6 pointing on "JAVA" in string pool,
                                          // whereas str8 pointing on "JAVA" object which is in heap

        System.out.println(str8 == str9); // both "JAVA" objects are differently created in heap memory
                                          // str8 and str9 references are pointing on diffrent "JAVA" objects

    }
}

// ABCD
// DEF
// Python
// JAVA

// true
// false
// false
// false