package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] array = {2,2,2,2,2,4,4,5,5,5,1,1,2,3,4,5,6,7,8,100};



        //When
        double theAverage = ArrayOperations.getAverage(array);

        //Then
        assertEquals(8.5, theAverage);
    }
}
