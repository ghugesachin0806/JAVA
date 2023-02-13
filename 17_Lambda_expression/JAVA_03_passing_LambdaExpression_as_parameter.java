
// Passing LambdaExpression object as parameter

@FunctionalInterface
interface MyLambda {

    void dispaly();
}

class Test {

    void meth1(MyLambda d1) {

        d1.dispaly();
    }
}

class Exam {

    public void meth2() {

        MyLambda L1 = () -> {

            System.out.println("HELLO WORLD  : ");
        };

        // Passing LambdaExpression or its Object as parameter
        Test t1 = new Test();

        t1.meth1(L1);
        t1.meth1(() -> {System.out.println("WORLD IS ROUND : ");});
    }

}

public class JAVA_03_passing_LambdaExpression_as_parameter {

    public static void main(String[] args) {

        Exam E1 = new Exam();
        E1.meth2();
    }
}

// HELLO WORLD :
// WORLD IS ROUND :
