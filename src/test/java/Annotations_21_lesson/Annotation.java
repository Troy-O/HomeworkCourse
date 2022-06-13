package Annotations_21_lesson;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
    public String name() default "Дефолтне значення";

}
