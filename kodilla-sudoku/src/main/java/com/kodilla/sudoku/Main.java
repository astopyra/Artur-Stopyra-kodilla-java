package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;

public class Main {
    public static void main(String[] args) {

        /*boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }*/


        DataReceiver dataReceiver = new DataReceiver();
        SudokuBoard board = new SudokuBoard();

        System.out.println("\nWitamy w Sudoku Solver");
        System.out.println(board);
        dataReceiver.readData();
        board.setBoard(dataReceiver.rowNo, dataReceiver.columnNo, dataReceiver.value);
        System.out.println(board);;






    }
}