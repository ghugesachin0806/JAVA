
class Circle {

    public int radius;

    public double area() {

        return Math.PI * radius * radius;

    }

    public double perimeter() {

        return 2 * Math.PI * radius;

    }
}

public class JAVA_01_oops_intro {

    public static void main(String arg[]) {

        // Creating new objects
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        // passing values to the objects
        c1.radius = 6;
        c2.radius = 7;

        // Calling class methods using object
        System.out.println("c1 area : " + c1.area());
        System.out.println("c2 area : " + c2.area());

        System.out.println("c1 perimeter : " + c1.perimeter());
        System.out.println("c2 perimeter : " + c2.perimeter());

    }
}

// c1 area : 113.09733552923255
// c2 area : 153.93804002589985
// c1 perimeter : 37.69911184307752
// c2 perimeter : 43.982297150257104