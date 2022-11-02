package com.kodilla.rps;

import static com.kodilla.rps.RPSGame.scan;

public class RpsRunner {

    public static void main(String[] args) {
        RpsSetUp rpsSetUp = new RpsSetUp();

        boolean end = false;

        rpsSetUp.printInitialInfo();


        while(!end) {
            RPSGame rps = new RPSGame();

            while (rps.getPlayerWin() < rpsSetUp.getRoundsQuantity() &&
                    rps.getComputerWin() < rpsSetUp.getRoundsQuantity()) {
                rps.playRound();
            }

            if (rps.getPlayerWin() > rps.getComputerWin()) {
                System.out.println("\nWYGRYWA: " + rpsSetUp.getPlayerName());
            } else {
                System.out.println("\nWYGRYWA: COMPUTER");
            }


            char playAgain = 'a';

            while (playAgain != 'n' && playAgain != 'x') {
                System.out.println("Zakończyć grę - wybierz 'x'\nZacznij od nowa - wybierz 'n'");
                playAgain = scan.next().charAt(0);

            }

            switch (playAgain) {
                case 'n':
                    end = false;
                    break;
                case 'x':
                    end = true;
                    break;
            }

        }

    }
}
