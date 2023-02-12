
// The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

public class JAVA_02_Wrapper_classes {

    public static void main(String[] args) {

        // Here 'int' is primitive datatype means built-in datatype
        int i = 10; // 'int' is primitive datatype

        // Following are the methods to pass the primitive data types to wrapper class
        int a=23;
        Integer temp1 = Integer.valueOf(a);// converting int into Integer explicitly
        Integer temp2 = temp1;// autoboxing, now compiler will write Integer.valueOf(a) internally
        Integer temp3 = Integer.valueOf(85);
        Integer temp4 =10; 
        Integer temp5 = Integer.valueOf("145"); // It will pass value by converting string into int value


        Float f1 = Float.valueOf(123.12f);
        Character c1 = Character.valueOf('g');
        Double d1 = Double.valueOf(85.8000);
        Boolean b1=Boolean.valueOf(false);

        /////////////////////////////////////////////////////////////////////////

        byte bb=90;
        // Below obj1 object of Byte class is created around 'bb' variable
        // or 'obj1' object is wrapping bb variable
        Byte obj1 = Byte.valueOf(bb); 
    }
}
