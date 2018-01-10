package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 != 0) {
                numbers.remove(numbers.get(i));
            }
        }
    }
}