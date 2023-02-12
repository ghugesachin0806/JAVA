
public class JAVA_04_Integer_class
{
    public static void main(String[] args) {
        

        int m1=15;
        int m3=15;

        Integer m2 =m1;

        // equals() method allow comparing of object with primitive data_type
        // m1 -> primitive data_type
        // m2 -> object of Integer wrapper class
        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));

    }
}