package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("test case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("test case: end");
    }

    @DisplayName("When exterminate method called on empty list" +
    "then should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> list = new ArrayList<>();
        //When
        List<Integer> evenList = new ArrayList<>();
        List<Integer> compareList = new ArrayList<>();
        evenList = new OddNumbersExterminator().exterminate(list);
        //Then
        Assertions.assertEquals(evenList, compareList);
    }

    @DisplayName("when method exterminate called on non empty list " +
            "then should return list with only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        Integer[] array = {1,2,3,4};
        List<Integer> list = Arrays.asList(array);
        //When
        List<Integer> evenList = new ArrayList<>();
        List<Integer> compareList = new ArrayList<>();
        compareList.add(2);
        compareList.add(4);
        evenList = new OddNumbersExterminator().exterminate(list);
        //Then
        Assertions.assertEquals(evenList, compareList);
    }
}
