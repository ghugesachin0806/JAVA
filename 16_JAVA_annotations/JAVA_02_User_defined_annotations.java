
// annotations can be used for class,methods,variables and parameters

// Points to remember for java custom annotation signature
// 1. Method should not have any throws clauses
// 2. Method should return one of the following: primitive data types, String, Class, enum or array.
// 3. Method should not have any parameter.
// 4. We should attach @ just before interface keyword to define annotation.
// 5. It may assign a default value to the method.


// defining user-defined annotation
@interface MyAnno {

    // Meta_data of annotation OR methods of annotations
    // if default is not provided then those methods are mandatory to provide values while writting annotation
    // if default is provided then methods are optional to provide values

    String Project();  // parameters or exception handling are not allowed to write

    String name();

    float type();

    String version() default "13"; // it is Optional to provide values while using annotation
}

// 'version' method is optional to provide value b'cause it have default value ,but we can provide value
@MyAnno(Project = "Annotation", name = "Class_work", type = 10)  // annotation is used for class
public class JAVA_02_User_defined_annotations {

    @MyAnno(Project = "Method_Project", name = "method", type = 11, version = "11.1") // annotation is used for methods
    public void display(int match) {

        System.out.println("Math of the day : " + match);
    }

    // annotation is used for parameter
    public static void main(@MyAnno(Project = "Parameter_Anno", name = "para", type = 9) String[] args) {


    }
}
