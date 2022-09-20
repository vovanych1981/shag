package lesson17;

public class Main {
    public static void main(String[] args) {
        Phone ph1 = new Phone(123456, "Iphone", 50);
        Phone ph2 = new Phone(654987, "Redmi");
        Phone ph3 = new Phone();

        System.out.println(ph1);
        System.out.println(ph2);
        System.out.println(ph3);

        ph1.receiveCall("Валя", 222333);
        ph2.receiveCall("Коля", 444555);
        ph3.receiveCall("Петя", 77888);


    }
}
