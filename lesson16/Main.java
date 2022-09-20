package lesson16;

public class Main {
    public static void main(String[] args) {
        /*Fraction f1 = new Fraction();
        f1.print();
        f1.setNom(1);
        f1.setDenom(2);
        f1.print();
        Fraction f2 = new Fraction(2,5);
        f2.print();
        Fraction f3 = f1.mul(f2);
        f3.print();*/
        Knight k1 = new Knight("Ilya Muromets", 10, 50);
        System.out.println(k1);
        Paladin p1 = new Paladin("Dobrinya Nikitich", 10, 50);
        System.out.println(p1);
        while (p1.isAlive() && k1.isAlive()) {
            System.out.println(k1.getName() + " hits" + p1.getName());
            p1.takeHit(k1);
            System.out.println(p1);
            if(!p1.isAlive()) break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(p1.getName() + " hits" + k1.getName());
            k1.takeHit(p1);
            System.out.println(k1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        if(k1.isAlive()) System.out.println(k1.getName() + " wins!");
        else System.out.println(p1.isAlive() + " wins!");

    }
}
