public class JAVA_03_Wrapper_Auto_boxing {

    public static void main(String[] args) {

        // converting primitive datatype into object or Autoboxing

        // one way
        int temp = 10; // primitive data type
        Integer obj1 = Integer.valueOf(temp);

        // another way
        int temp2 = 11;
        Integer obj2 = temp2; // Integer obj2 = Integer.valueOf(temp2); <---- similar

        // Converting Object into primitive data or Auto-unboxing

        // one way
        Integer obj3 = Integer.valueOf(99);
        int temp3 = obj3.intValue();

        // Another way
        Integer obj4 = Integer.valueOf(98);
        int temp4 = obj4;  //  int temp4 = obj4.intValue(); <------ similar

    }
}
