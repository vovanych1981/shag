package hw1;

public class Task1 {
    public static void main(String[] args) {
//     Begin13.Даны два круга с общим центром и радиусами R1 и R2 (R1>R2).
//             Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний радиус которого равен R1,
//             а внутренний радиус равен R2: S1=π·(R1)2, S2=π·(R2)2, S3=S1−S2.


            double R1 = 32;
            double R2 = 25;

            double S1 = 3.14 * Math.pow(R1, 2);
            System.out.println("S1=" + S1);
            double S2 = 3.14 * Math.pow(R2, 2);
            System.out.println("S2=" + S2);
            double S3 = S1 - S2;
            System.out.println("S3=" + S3);

        }
    }
