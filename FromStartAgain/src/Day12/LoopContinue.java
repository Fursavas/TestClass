package Day12;

import java.util.Random;

public class LoopContinue {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Start iteration " + i);
            if (i % 2 == 0) {
                continue;
            }else {
                System.out.println("number is " +i);
            }
        }
        System.out.println("End iterations " + number);

    }
}
