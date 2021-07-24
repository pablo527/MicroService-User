package com.example.springcourse.util;

import com.example.springcourse.util.formula.Formula;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FormulaTest {

    @Test
    void calculatePMT(){
        double valuePMT = Math.floor(Formula.calculatePMT(20000,0.02,48));
        System.out.println(valuePMT);
        Assertions.assertEquals(652, valuePMT);
    }
}
