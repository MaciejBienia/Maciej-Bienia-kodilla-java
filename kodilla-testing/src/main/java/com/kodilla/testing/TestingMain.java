package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        String positiveResult = "test OK";
        String negativeResult = "Error!";
        int result = 7;

        if (calculator.add(2, 5) == result){
            System.out.println(positiveResult);
        } else {
            System.out.println(negativeResult);
        }
        if (calculator.substract(11, 4) == result){
            System.out.println(positiveResult);
        } else {
            System.out.println(negativeResult);
        }
    }
}