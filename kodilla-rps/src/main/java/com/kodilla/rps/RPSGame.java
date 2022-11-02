package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class RPSGame {

    private int playerMove, computerMove;
    Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    private int playerWin = 0;
    private int computerWin = 0;
    private int draw = 0;

    public void playRound(){
        boolean correctNumber = false;
        while (!correctNumber){
            try {
                System.out.println("Wybierz ruch");
                playerMove = scan.nextInt();
                correctNumber = true;
            } catch (InputMismatchException e){
                System.out.println("Wprowadź poprawne dane!");
                correctNumber = false;
                String word = scan.nextLine();
            }
        }

        computerMove = random.nextInt(1, 4);

        if(playerMove == computerMove){                         //1-kamien 2-papier 3-nozyce
            System.out.println("Remis, spróbuj jeszcze raz\n");
            draw++;
        } else if(playerMove == 1){
            System.out.println("Wybrałeś: kamień");
            if(computerMove == 2){
                System.out.println("Komputer wybrał papier\nKomputer wygrywa!");
                computerWin++;
            } else{
                System.out.println("Komputer wybrał nożyce\nWygrywasz!");
                playerWin++;
            }
        } else if(playerMove == 2) {
            System.out.println("Wybrałeś: papier");
            if (computerMove == 1) {
                System.out.println("Komputer wybrał kamień\nWygrywasz!");
                playerWin++;
            } else {
                System.out.println("Komputer wybrał nożyce\nKomputer wygrywa!");
                computerWin++;
            }
        } else if(playerMove == 3) {
            System.out.println("Wybrałeś: nożyce");
            if (computerMove == 1) {
                System.out.println("Komputer wybrał kamień\nKomputer wygrywa!");
                computerWin++;
            } else {
                System.out.println("Komputer wybrał papier\nWygrywasz!");
                playerWin++;
            }
        }
        System.out.println("Results: Player wins: " + playerWin +
                " Computer wins: " + computerWin + " Draws: " + draw);
    }



    public int getPlayerWin() {
        return playerWin;
    }

    public int getComputerWin() {
        return computerWin;
    }
}
