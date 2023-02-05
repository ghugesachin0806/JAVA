interface Show {

    public void display();
}

class Aest {
    Show st;

    public Aest(Show st) // object passed from outside world
    {
        System.out.println("Aest constructor: ");

        // st is loosely coupled to Aest
        this.st = st;
    }

    public void display() {

        System.out.println("Aest display : ");
        st.display();
    }
}

class Best implements Show {
    public Best() {

        System.out.println("Best constructor: ");
    }

    public void display() {

        System.out.println("Best display : ");
    }
}

class Cest implements Show {
    public Cest() {

        System.out.println("Cest constructor: ");
    }

    public void display() {
        System.out.println("Cest display : ");
    }
}

public class JAVA_02_loose_coupling {

    public static void main(String[] args) {

        Show b = new Best();
        Show c = new Cest();

        // object passed to object
        Aest a = new Aest(b);
        // a.display() will print Aest and Best
        a.display();

        // object passed to object
        Aest a1 = new Aest(c);
        // a.display() will print Aest and Cest
        a1.display();

    }
}

// Best constructor:
// Cest constructor:

// Aest constructor:
// Aest display :
// Best display :

// Aest constructor:
// Aest display :
// Cest display :