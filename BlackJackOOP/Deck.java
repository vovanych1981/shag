package lesson20.BlackJackOOP;

import java.util.ArrayList;

public class Deck {
    private final int suitSize = 13;

    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        init();
        shuffle();
    }

    private void init() {

        initSuit('\u2661');
        initSuit('\u2662');
        initSuit('\u2664');
        initSuit('\u2667');
    }

    private void shuffle() {

    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }

    private void initSuit(char suit) {
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < suitSize; i++) {
            deck.add(new Card(suit, ranks[i]));

        }

    }
}
