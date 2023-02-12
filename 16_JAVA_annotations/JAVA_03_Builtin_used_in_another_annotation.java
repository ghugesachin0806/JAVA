import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented  // The @Documented Marks the annotation for inclusion in the documentation.
@Retention(RetentionPolicy.RUNTIME) // refers to the runtime, available to java compiler and JVM .

// @Target tag is used to specify at which type, the annotation is used.
@Target({ElementType.LOCAL_VARIABLE,ElementType.CONSTRUCTOR})

// By default, annotations are not inherited to subclasses.
//  The @Inherited annotation marks the annotation to be inherited to subclasses.
@Inherited
@interface MyAnno {

    String Project();

    String name();

    float type();

    String version() default "13";
}


// @MyAnno(Project = "Annotation", name = "Class_work", type = 10) <---- Cannot used for Class as per @Target
class Test
{
    @MyAnno(Project = "Ann_constr", name = "Const_work", type = 12) // can be used for constructor according to @Constructor
    public Test()
    {

        System.out.println("Test class Constructor ");
    }
}

public class JAVA_03_Builtin_used_in_another_annotation {

    int data;

    public static void main(String[] args) {

        @MyAnno(Project = "Annotation", name = "Class_work", type = 10) // can be used for Local_variable according to @Target
        int x;
    }
}
