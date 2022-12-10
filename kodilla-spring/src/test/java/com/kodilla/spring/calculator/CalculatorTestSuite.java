package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testAdd(){
        //given
        //when
        double result = calculator.add(3,2);

        //then
        assertEquals(5, result);
    }

    @Test
    void testSub(){
        //given
        //when
        double result = calculator.sub(3,2);

        //then
        assertEquals(1, result);
    }

    @Test
    void testMul(){
        //given
        //when
        double result = calculator.mul(3,2);

        //then
        assertEquals(6, result);
    }
    @Test
    void testDiv(){
        //given
        //when
        double result = calculator.div(3,2);

        //then
        assertEquals(1.5, result);
    }

}
