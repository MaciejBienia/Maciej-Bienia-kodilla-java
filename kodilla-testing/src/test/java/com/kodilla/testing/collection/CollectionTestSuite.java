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
        Assert.assertEquals(emptyList, numbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numbers.add(i);
        }
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int j = 0; j < 10; j += 2) {
            evenNumbers.add(j);
        }
        //When
        exterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(evenNumbers, numbers);
    }
}