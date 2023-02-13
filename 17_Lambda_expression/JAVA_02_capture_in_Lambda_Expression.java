
// Lambda Expression behave like inner class.
// It can access outer class's instance variable ,
// but to access the variables of the methods where LambdaExpression is defined ,
// those variables needs to be 'final' or value of those variable will not change after that

@FunctionalInterface
interface MyLambda
{

    void dispaly();
}

class Test
{

    int temp1 =10;

    void meth1()
    {
        int temp2 = 12;
        final int temp3 =13;
        MyLambda L1 = ()->{

            int temp4 = 66;
            
            temp1++;   // LambdaExpression is treated as inner class, so it can use or modify outer class values
            // temp2++; <--- Not allowed to change the value, as variable should be final, if not final then treated as final
            temp4++;

            int k=temp2;
            int l=temp3;
        };

        // temp2++; <--- not allowed to change , it is used in lambdaExpression to treat it as final
        // so changing value of 'temp2' is not allowed
    }
}

public class JAVA_02_capture_in_Lambda_Expression {
    
    public static void main(String[] args) {
        
        Test t1 = new Test();
        t1.meth1();
    }
}
