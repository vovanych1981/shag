package Lesson28;

public class Test {
    public static void main(String[] args) {
        //Integer[] mas = {1,3,5,6,9,8,7,11,15,20};
        BinaryHeap<Integer> bh1  =new BinaryHeap<>();

        bh1.add(1);
        bh1.add(3);
        bh1.add(7);
        bh1.add(22);
        bh1.add(34);
        bh1.add(21);
        bh1.add(10);
        System.out.println(bh1.getElements());
    }

}
