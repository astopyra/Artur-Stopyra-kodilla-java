package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {

    private List<SudokuRow> board = new ArrayList<>();

    public SudokuBoard(){
        for(int i=0; i<9; i++){
            board.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    public void setBoard(int rowNo, int columnNo, int value){
        board.get(rowNo-1).getElement(columnNo-1).setValue(value);
        board.get(rowNo-1).getElement(columnNo-1).setValues(new ArrayList<>());
    }

    @Override
    public String toString() {
        System.out.println("Sudoku Board\n-----------------------");
        String s = "";
        for(int i=0; i<9; i++){
            if(i%3 == 0 && i>0){
                s += "\n";
            }
            s += board.get(i).toString() + "\n";
        }
        return s;
    }
}
