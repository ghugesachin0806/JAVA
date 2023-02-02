class Circle {

    public double radius;

    public double area() {

        return Math.PI * radius * radius;

    }

    public double perimeter() {

        return 2 * Math.PI * radius;

    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class JAVA_01_inheritance {

    public static void main(String arg[]) {

        Circle c1 = new Circle();
        c1.radius = 11;

        System.out.println("area of circle : " + c1.area());

        Cylinder c2 = new Cylinder();
        c2.radius = 22;
        c2.height = 22;

        System.out.println("volume of cylinder : " + (c2.height * c2.area()));
        System.out.println("area of cylinder's circle : " + c2.area());

    }

}

// area of circle : 380.1327110843649
// volume of cylinder : 33451.678575424114
// area of cylinder's circle : 1520.5308443374597