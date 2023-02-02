// The super keyword in Java is a reference variable which is used to refer immediate parent class object.

// The this keyword can be used to refer current class instance variable.
// If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.

class Rectangle {

    public int length;
    public int breadth;
    public int x;

    Rectangle(int length, int breadth) {

        this.x = 10;
        this.length = length; // 'this' keyword is used
        this.breadth = breadth;
    }

    public void call_rectangle() {

        System.out.println("value of x of Rectangle class : " + this.x);
    }

}

class Cuboid extends Rectangle {

    public int height;
    public int x;

    Cuboid(int l, int b, int h) {

        // 'super' keyword is used
        super(l, b);
        this.x = 20;
        this.height = h;
    }

    public void call_cuboid() {

        System.out.println("value of x of cuboid(child) class : " + this.x); // 'this' keyword is used

        System.out.println("value of x of Rectangle(Parent) class : " + super.x); // 'super' keyword is used
    }

}

public class JAVA_05_this_n_super {

    public static void main(String str[]) {

        Cuboid c1 = new Cuboid(11, 22, 33);

        c1.call_cuboid();
    }

}

// value of x of cuboid(child) class : 20
// value of x of Rectangle(Parent) class : 10
