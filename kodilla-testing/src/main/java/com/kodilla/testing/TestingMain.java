package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //test calculator
        Calculator calc = new Calculator();
        int wynik = calc.add(9,11);

        if(wynik == 9+11){
            System.out.println("Calculator adding test ok");
        }else {
            System.out.println("Calculator adding test: error");
        }

        wynik = calc.subtract(9, 11);

        if(wynik == 9-11){
            System.out.println("Calculator subtracting test ok");
        }else {
            System.out.println("Calculator subtracting test: error");
        }
    }
}
