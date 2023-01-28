class Rectangle {

    // data types variables
    private int length;
    private int breadth;

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

public class JAVA_02_oops_intro_02 {

    public static void main(String arg[]) {
        Rectangle r1 = new Rectangle();

        r1.setLength(10);
        r1.setBreadth(20);

        System.out.println("Area of rectangle : " + r1.area());
        System.out.println("Perimeter of rectangle : " + r1.perimeter());
    }

}

// Area of rectangle : 200.0
// Perimeter of rectangle : 60.0