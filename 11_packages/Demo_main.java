
import mypack2.*; // importing all the classes of 'mypack1' packages

import mypack1.Test1; // importing single class from 'mypack2' package

import mypack1.inner.*; // importing all the 'inner' package's class which is inside 'mypack1' package

public class Demo_main {
    
    public static void main(String[] args) {
        
        // class of mypack1 package
        Test1 t1 = new Test1();
        t1.display();

        // class of mypack2 package
        Test3 t2 = new Test3();
        t2.display();
        
        // class of inner package of mypack1 package
        Test_inner t3= new Test_inner();
        t3.display();

        // Here mypack1 package's Test4 class is imported and used simultaneously
        mypack1.Test4 t4 = new mypack1.Test4();   // Here Test4 class of mypack1 package is imported and used
        t4.display();
    }
}

// Display of Test1 class of Test1 java file  : mypack1 

// Display of Test3 class of Test3 java file  : mypack2     

// Display of Test1 class of Test1 java file  : mypack1.inner 

// Display of Test4 class of Test4 java file  : mypack1      