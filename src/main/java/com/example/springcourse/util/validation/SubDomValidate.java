package com.example.springcourse.util.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SubDomValidate implements ConstraintValidator<ISubDom, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String subDom = "@tcs.com";
        return value.contains(subDom);
    }
}
