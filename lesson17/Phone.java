package lesson17;

public class Phone {
    private int number;
    private String model;
    private int weight;

    @Override
    public String toString() {
        return "number " + number + " model " + model + " weight " + weight ;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void getNumber(){
        System.out.println("Звонит номер " + number);
    }
    public Phone(int n, String m, int w){
        this(n,m);
        this.weight = w;
    }
    public Phone(int n, String m){
        this.number = n;
        this.model = m;
    }
    public Phone(){

    }
    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + "по номеру телефона " + number);
    }

}
