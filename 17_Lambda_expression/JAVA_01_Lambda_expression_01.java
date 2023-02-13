
// Only one abstract method is allowed inside interface to be treated as 'functional Interface'
@FunctionalInterface
interface MyLambda {
    void dispaly(); // Only one abstract method

    default void MyMethod() {
        System.out.println("Default Method : ");
    }
}

@FunctionalInterface
interface MyLambda2 {
    void dispaly(int x); // only one abstract method
}

@FunctionalInterface
interface MyLambda3 {
    int add(int x, int y); // only one abstract method
}

public class JAVA_01_Lambda_expression_01 {

    public static void main(String[] args) {

        // Without Lambda Expression
        // Drawable implementation using anonymous inner class

        MyLambda L1 = new MyLambda() {

            public void dispaly() {

                System.out.println("Anonymous Inner class Method :  ");

            }
        };

        L1.dispaly();

        //////////////////////////////////////////////////////////////////////////////////////////

        // With LambdaExpression

        // Implementing LambdaExpression using 'Functional Interface'

        MyLambda L2 = () -> {

            System.out.println("Lambda Expression : ");
        };

        L2.dispaly();

        // Parameterized LambdaExpression
        MyLambda2 L3 = (int x) -> { // MyLambda2 L3 = (x) -> { <<<----- This also allowed

            System.out.println("Parameterized Lambda Expression : " + x);
        };

        L3.dispaly(44);

        // Lambda expression with return keyword.    
        MyLambda3 L4 = (x, y) -> {

            return x + y;
        };

        // Lambda expression without return keyword.  
        // It is returning direct answer without return statement,
        // that's why it is called as LambdaExpression , which is returning expression value
        MyLambda3 L5 = (a, b) -> a + b;

        System.out.println(L4.add(44, 77));
        System.out.println(L5.add(99, 22));

    }
}

// Anonymous Inner class Method :
// Lambda Expression :
// Parameterized Lambda Expression : 44
// 121