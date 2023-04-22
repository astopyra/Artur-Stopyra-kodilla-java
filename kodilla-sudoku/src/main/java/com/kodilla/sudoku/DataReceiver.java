package com.kodilla.sudoku;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReceiver {

    public int rowNo, columnNo, value;
    Scanner scanner = new Scanner(System.in);

    public void readData(){


        boolean done = false;
        do{
            try {
                System.out.println("Podaj dane (nr_wiersza,nr_kolumny,wartosc) z przedziału 1-9 " +
                        "\nlub wpisz ENTER żeby rozwiązać Sudoku:");
                String[] numbers = scanner.nextLine().split(",");
                if (numbers.length>=3){
                    rowNo = Integer.parseInt(numbers[0]);
                    columnNo = Integer.parseInt(numbers[1]);
                    value = Integer.parseInt(numbers[2]);
                    done = true;
                } else {
                    System.out.println("Podałeś złe dane!!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Podałeś złe dane!");
            }
        }while (!done || rowNo>9 || rowNo<1 || columnNo>9  || columnNo<1 || value>9  || value<1);
    }

    public int getRowNo() {
        return rowNo;
    }

    public int getColumnNo() {
        return columnNo;
    }

    public int getValue() {
        return value;
    }
}
