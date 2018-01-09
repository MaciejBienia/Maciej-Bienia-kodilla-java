package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator test
        Calculator calculator = new Calculator();

        String positiveResult = "test OK";
        String negativeResult = "Error!";
        int calcResult = 7;

        if (calculator.add(2, 5) == calcResult){
            System.out.println(positiveResult);
        } else {
            System.out.println(negativeResult);
        }
        if (calculator.substract(11, 4) == calcResult){
            System.out.println(positiveResult);
        } else {
            System.out.println(negativeResult);
        }
    }
}