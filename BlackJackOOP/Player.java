package lesson20.BlackJackOOP;

import java.util.Scanner;

public class Player extends Hand {
    @Override
    public void play(Deck deck) {
        Scanner in = new Scanner(System.in);
        char answer = 'y';

        takeOneCard(deck);
        takeOneCard(deck);
        while (calcScore() < 21 && answer == 'y') {
            System.out.println("Ваша рука" + hand + "ваш результат: " + calcScore());
            System.out.println("Ты хочешь еще одну карту?"); // nbg y для да
            answer = in.nextLine().charAt(0);
            if (answer == 'y') {
                takeOneCard(deck);
            }

        }
        /*if (calcScore() == 21) {
            System.out.println("Игрок выиграл");
        } else if (calcScore() > 21) {
            System.out.println("Игрок проиграл");
        }*/
        System.out.println("Ваша рука" + hand + "ваш результат: " + calcScore());
    }
}
