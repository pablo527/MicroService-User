package com.example.springcourse.util.validation;

import org.springframework.context.PayloadApplicationEvent;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AdultValidation.class)

public @interface IAdult {
    String message() default "the user is not of legal age";
    Class<?> [] groups() default {};

    Class< ? extends PayloadApplicationEvent> [] payload() default {};
}
