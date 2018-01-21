package com.kodilla.stream.array;
import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers[] = new int[20];
        for(int n = 0; n < 20; n++) {
            numbers[n] = n * 3;
        }
        //When
        double averageNumbers = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(28.5, averageNumbers, 0.001);
        System.out.println("\nAverage of those numbers = " + averageNumbers);
    }
}