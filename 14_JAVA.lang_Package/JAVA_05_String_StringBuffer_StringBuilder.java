public class JAVA_05_String_StringBuffer_StringBuilder {
    
    public static void main(String[] args) {
        
        // String is immutable
        // StringBuffer is mutable
        // StringBuilder is mutable

        // StringBuffer is synchronized i.e. thread safe
        // StringBuffer is non-synchronized i.e. not thread safe

        // String class
        String str1 = new String("String");

        // StringBuffer class
        StringBuffer str2 = new StringBuffer("Buffer");

        // StringBuilder class
        StringBuilder str3 = new StringBuilder("Builder");

        // str1.append("append"); // String class is immutable , so don't allow to append
        str2.append("append");
        str3.append("append");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}

// String
// Bufferappend 
// Builderappend