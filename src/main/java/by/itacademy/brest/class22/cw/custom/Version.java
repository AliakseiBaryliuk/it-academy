package by.itacademy.brest.class22.cw.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
public @interface Version {
    String info() default "1.0";
}
