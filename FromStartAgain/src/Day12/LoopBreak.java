package Day12;

import java.util.Random;


public class LoopBreak {
    public static void main(String[] args) {
        Random random = new Random();
        int number = 0;
        int random_int1= random.nextInt(232556);
        for (int i = 1; i <= 10000000; i++) {

            if (i == 10000000) {
                number = i;
                break;
            }

        }
        System.out.println("Your number is " + number);
    }
}
