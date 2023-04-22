package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {

    private static int EMPTY = 0;
    private int value = EMPTY;
    private List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));


    public int getValue() {
        return value;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
