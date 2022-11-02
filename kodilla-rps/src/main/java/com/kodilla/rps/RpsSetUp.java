package com.kodilla.rps;

import java.util.InputMismatchException;

import static com.kodilla.rps.RPSGame.scan;

public class RpsSetUp {

    private int roundsQuantity = 0;
    private String playerName;

    public void printInitialInfo() {
        System.out.println("ROCK-PAPER-SCISSORS Game");
        System.out.println("Jak masz na imię?");
        playerName = scan.nextLine();

        boolean correctNumber = false;
        while (!correctNumber){
            try {
                System.out.println("Do ilu wygranych rund gramy?");
                roundsQuantity = scan.nextInt();
                correctNumber = true;
            } catch (InputMismatchException e){
                System.out.println("Wprowadź poprawne dane!");
                correctNumber = false;
                String word = scan.nextLine();
            }
        }


        System.out.println("klawisz 1 – zagranie \"kamień\",\n" +
                "klawisz 2 – zagranie \"papier\",\n" +
                "klawisz 3 – zagranie \"nożyce\",\n" +
                "klawisz x – zakończenie gry \n" +
                "klawisz n – uruchomienie gry od nowa ");
    }

    public int getRoundsQuantity(){
        return roundsQuantity;
    }

    public String getPlayerName() {
        return playerName;
    }
}
