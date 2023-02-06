
class Temp
{
    static int t =10;
    public int a=20;
    public int b=30;

    static public void display()
    {
        System.out.println("static display method : ");

        System.out.println(t);  // only static variables of the class are allowed inside static method
    }
}



public class JAVA_01_static_01 {
    
    public static void main(String[] args) {
        
        // one way of accessing static data members of class without creating instance/object of a class

        System.out.println("static data variable of class Test "+ Temp.t); // static data variable with classs name  

        Temp.display(); // static method with class name

        Temp.t=30; // modifying static data variable with class name

        System.out.println("static data variable of class Test "+ Temp.t); // static data variable with classs name  


        /////////////////////////////////////////////////////////////////////////

        // Another way of accessing static data members of class with object/instance of that class

        Temp obt1 = new Temp();
        Temp obt2 = new Temp();

        System.out.println("static data variable of class Test "+ obt1.t);

        obt1.t=45; // Here the value of static varible will change for every object as well as for that class

        System.out.println("static data variable of class Test "+ obt2.t);

        obt1.display();
        obt2.display();

    }
}

// static data variable of class Test 10
// static display method : 
// 10

// static data variable of class Test 30

// static data variable of class Test 30

// static data variable of class Test 45

// static display method : 
// 45

// static display method : 
// 45