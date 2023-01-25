public class JAVA_03_intro_03 {
    public static void main(String arg[]) {

        int a = 90;
        int b = 78;
        int result = a + b;

        System.out.println(result);

        /////////////////////////////////////////////////////////////////////////

        // default datatype of point integers is double
        double num2 = 90.78;

        float marks = 6.5f;  // Here float is defined like this , by giving 'f' to the end of number

        long lt = 999999999999L; // Here long is defined like this , by giving 'L/l' at the end of number

        char ch ='u';

        boolean th=false;

        System.out.println(num2);
        System.out.println(marks);
        System.out.println(ch);
        System.out.println(th);
        System.out.println(lt);

        ////////////////////////////////////////////////////////////////////////

        // type casting in variables
        float f1=5.6f;

        int x=(int)f1;

        System.out.println(x);

        //////////////////////////////////////

        byte b1=8;
        int a1 =9;

        int a2=b1;
        byte b2=(byte)a1;

        System.out.println(a2);
        System.out.println(b2);
    }
}

// 168
// 90.78
// 6.5  
// u    
// false
// 999999999999

// 5    

// 8    
// 9