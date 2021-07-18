package com.example.springcourse.util.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class AdultValidation implements ConstraintValidator<IAdult, Date> {

    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        LocalDate now = LocalDate.now();
        LocalDate birthDate = value.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int age = Period.between(birthDate, now).getYears();
        return age >= 18;
    }
}
