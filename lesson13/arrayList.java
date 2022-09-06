package lesson13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class arrayList {
    static void createDeck(ArrayList<Integer> fdeck) {
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i <= 9; i++) {
                fdeck.add(i);
            }
            for (int i = 0; i < 4; i++) {
                fdeck.add(10);
            }
        }

    }

    static void shuffleDeck(ArrayList<Integer> fdeck) {
        Random gen = new Random();
        for (int i = 0; i < fdeck.size() - 1; i++) {
            int randomIndex = gen.nextInt(fdeck.size() - (i + 1)) + (i + 1);
            int temp = fdeck.get(i);
            fdeck.set(i, fdeck.get(randomIndex));
            fdeck.set(randomIndex, temp);

        }
    }

    static void playerTurn(ArrayList<Integer> fdeck, ArrayList<Integer> fplayer) {
        // игрок по желанию берет карту из колоды
        Scanner in = new Scanner(System.in);
        int answer;
        do {
            playerTakeOneCard(fdeck, fplayer);
            // выдать сколько у игрока очков на экран
            int playerScore = calcScore(fplayer);
            System.out.println("У вас " + playerScore + " очков");
            if (playerScore >= 21) break;
            else {
                System.out.println("Хотите взять еще одну карту? 1- да, любая другая цифра - нет");
                answer = in.nextInt();
            }

        } while (answer == 1);
    }

    static void playerTakeOneCard(ArrayList<Integer> fdeck, ArrayList<Integer> fplayer) {
        //взять карту из колоды
        int card = fdeck.get(fdeck.size() - 1);
        //удалить взятую карту из колоды
        fdeck.remove(fdeck.size() - 1);
        //добавить эту карту игроку
        fplayer.add(card);
    }

    static int calcScore(ArrayList<Integer> fplayer) {
        int sum = 0;
        for (int i = 0; i < fplayer.size(); i++) {
            sum += fplayer.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        // создать новую колоду
        final int deckSize = 52;
        ArrayList<Integer> deck = new ArrayList<>();
        createDeck(deck);
        // перетасовать колоду
        shuffleDeck(deck);
        // создать игрока
        ArrayList<Integer> player = new ArrayList<>();
        // создать дилера
        ArrayList<Integer> dealer = new ArrayList<>();
        // ==действия игрока
        playerTurn(deck, player);
        // проверка результатов действий игрока
        // 1.игрок набрал 21, игра заканчивается, игрок выиграл
        if (calcScore(player) == 21) {
            System.out.println("Игрок выиграл.Конец игры");
            return;
        }
        // 2.игрок набрал больше 21, игра заканчивается, игрок проиграл
        // 3.меньше 21 очка, игрок сказал хватит
        // == действия дилера
        // проверка результатов действий дилера
        // 1.дилер набрал 21, игра заканчивается, дилер выиграл
        // 2.дилер набрал больше 21, игра заканчивается, дилер проиграл
        // 3.дилер меньше 21 очка
        // 3.1 у игрока больше очков, чем у игрока - выиграл игрок
        // 3.2 у дилера больше очков, чем у игрока - выиграл дилер
        // 3.3 у обоих поровну очков - ничья
    }
}
