package com.kodilla.testing.collection;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("OddNumbersExterminator test case: begin");
    }
    @After
    public void after(){
        System.out.println("OddNumbersExterminator test case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(emptyList, exterminator.exterminate(numbers));
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            numbers.add(i);
        }
        ArrayList<Integer> theEvenNumbers = new ArrayList<>();
        for(int j = 0; j < 100; j += 2) {
            theEvenNumbers.add(j);
        }
        //When
        exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(theEvenNumbers, exterminator.exterminate(numbers));
    }
}