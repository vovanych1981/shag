package lesson20.BlackJackOOP;

import java.util.Scanner;

public class Game {
    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
        playerWin = 0;
        dealerWin = 0;
        draws = 0;
    }

    public void play() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        char answer = 'y';
        while (answer == 'y') {
            player.play(deck);

            // проверка как сыграл player
            // if()

            if (player.calcScore() == 21) {
                System.out.println("Игрок выиграл");
                playerWin++;
                continue;
            } else if (player.calcScore() > 21) {
                System.out.println("Игрок проиграл");
                dealerWin++;
                continue;
            }
            dealer.play(deck);

            //проверка как сыграл dealer
            // dealer.endGame(player);

            if (dealer.calcScore() == 21) {
                System.out.println("Компьютер выиграл");
                dealerWin++;
            } else if (dealer.calcScore() > 21) {
                System.out.println("Компьютер проиграл");
                playerWin++;
            } else if (player.calcScore() > dealer.calcScore()) {
                System.out.println("Игрок выиграл");
                playerWin++;
            } else if (player.calcScore() < dealer.calcScore()) {
                System.out.println("Компьютер выиграл");
                dealerWin++;
            } else if (player.calcScore() == dealer.calcScore()) {
                System.out.println("Ничья");
                draws++;
            }
            System.out.println("Игрок выиграл: " + playerWin);
            System.out.println("Компьютер выиграл: " + dealerWin);
            System.out.println("Ничья! " + draws);
            System.out.println("Ты хочешь продолжить игру?");
            answer = in.nextLine().charAt(0);

        }
    }

    private Deck deck;
    private Player player;
    private Dealer dealer;
    private int playerWin;
    private int dealerWin;
    private int draws;
}


