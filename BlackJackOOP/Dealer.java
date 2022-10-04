package lesson20.BlackJackOOP;

public class Dealer extends Hand {
    @Override
    public void play(Deck deck) throws InterruptedException{
        takeOneCard(deck);
        takeOneCard(deck);
        while (calcScore() < 17) {
            System.out.println("Компьютер" + hand + " результат Компьютера: " + calcScore());

            takeOneCard(deck);
            Thread.sleep(1000);

        }
        System.out.println("Компьютер" + hand + " результат Компьютера: " + calcScore());
    }
}
