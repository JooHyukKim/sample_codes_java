package raw.chapter17;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface UserAnnotation {

    public int number();

    public String text() default "This is first annotation";


}

