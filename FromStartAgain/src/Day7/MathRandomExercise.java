package Day7;

public class MathRandomExercise {
    public static void main(String[] args) {
        //Random numbers in java use Math.random()
        System.out.println(Math.random()); // to print random

        System.out.println("--------1---------");

        int min = 0;
        int max = 3;
        int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(randomInRange);
        if (randomInRange == 0) {
            System.out.println("number is Zero");
        }
        if (randomInRange == 1) {
            System.out.println("number is One");
        }
        if (randomInRange == 2) {
            System.out.println("number is Two");
        }
        if (randomInRange == 3) {
            System.out.println("number is Three");
        }

        System.out.println("--------2---------");
        int min1 = -200;
        int max1 = 200;
        int randInRange = min1 + (int) (Math.random() * ((max1 - min1) + 1));
        System.out.println(randInRange);
        if (randInRange > 0) {
            System.out.println("its positive");
        }
        if (randInRange < 0) {
            System.out.println("its negative");
        }
        if (randInRange == 0) {
            System.out.println("its neutral");
        }

        System.out.println("--------3---------");
        int min2 = 0;
        int max2 = 200;
        int randInRange1 = min2 + (int) (Math.random() * ((max2 - min2) + 1));
        System.out.println(randInRange1);
        if (randInRange1 % 2 == 0) {
            System.out.println("its even");
        } else { // or if (randInRange1 % 2 != 0)
            System.out.println("its odd");
        }

        System.out.println("--------4---------");

        double min3 = 0;
        double max3 = 10;
        double rN = Math.random();
        System.out.println(rN);
        System.out.println(rN * max3);
        double rN2 = Math.random();
        System.out.println(rN2);
        System.out.println(rN2 * max3);
        int i1 = (int) (rN * max3);
        int i2 = (int) (rN2 * max3);
        int sum = i1 + i2;
        System.out.println(sum);


    }
}
