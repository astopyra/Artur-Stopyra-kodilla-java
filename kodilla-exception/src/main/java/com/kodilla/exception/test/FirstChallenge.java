package com.kodilla.exception.test;

import static java.lang.Double.NaN;

public class FirstChallenge {

    public double divide(int a, int b){

        try{
            return a/b;
        } catch (ArithmeticException e){
            System.out.println("You can Not devide by 0!!");
            return NaN;
        }
    }
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
