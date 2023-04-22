package com.kodilla.sudoku.board;

import com.kodilla.sudoku.board.SudokuElement;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> row = new ArrayList<>();

    public SudokuRow(){
        for(int i=0; i<9; i++){
            row.add(new SudokuElement());
        }
    }

    public SudokuElement getElement(int position){
        return row.get(position);
    }

    @Override
    public String toString() {
        String s = " ";
        for(int i=0; i<9; i++){
            if(i%3 == 0 && i>0){
                s += "  ";
            }
            s += row.get(i) + " ";
        }
        return s;
    }
}
