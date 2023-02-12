
enum Dept {

    CS, ECE, IT, CIVIL, CHEMICAL, MECHANICAL // Every valu here is final ,static and public
}

enum Days {

    SUNDAY, MONDAY, TUESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Methods of enum
    void display() {
        System.out.println("display method inside enum :");
    }
}

public class JAVA_06_enum {

    public static void main(String[] args) {

        // Enum is user-defined data-type in JAVA
        // Assining enum value to enum variable
        Dept temp1 = Dept.MECHANICAL;

        System.out.println("Ordinal of MECHANICAL :" + temp1.ordinal());
        System.out.println("Value of CHEMICAL : " + Dept.valueOf("CHEMICAL"));

        // printing enum value
        for (Dept t : Dept.values()) {

            System.out.println(t);
        }

        // enum methods
        Days d1;
        d1 = Days.FRIDAY;
        d1.display();
    }
}

// Ordinal of MECHANICAL :5
// Value of CHEMICAL : CHEMICAL

// CS
// ECE
// IT
// CIVIL
// CHEMICAL
// MECHANICAL

// display method inside enum :