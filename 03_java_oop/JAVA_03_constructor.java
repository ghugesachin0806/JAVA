// Constructors

class Rectangle {

    // data types variables
    private int length;
    private int breadth;

    // Default constructors
    public Rectangle() {

        // length = 1;
        // breadth = 1;

        // Another way
        setLength(1);
        setBreadth(1);
    }

    // parameterized constructors
    public Rectangle(int l, int b) {

        length = l;
        breadth = b;
    }

    public Rectangle(int s) {

        length = breadth = s;
    }

    // getter methods

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    // setter methods

    public void setLength(int l) {
        length = l;
    }

    public void setBreadth(int b) {
        breadth = b;
    }

    // Methods

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return (2 * length + 2 * breadth);
    }

}

public class JAVA_03_constructor {

    public static void main(String arg[]) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 35);

        System.out.println("Area of rectangle r1 : " + r1.area());
        System.out.println("Perimeter of rectangle r1 : " + r1.perimeter());

        System.out.println("Area of rectangle r2 : " + r2.area());
        System.out.println("Perimeter of rectangle r2 : " + r2.perimeter());
    }

}

// Area of rectangle r1 : 2.0
// Perimeter of rectangle r1 : 6.0
// Area of rectangle r2 : 350.0
// Perimeter of rectangle r2 : 90.0