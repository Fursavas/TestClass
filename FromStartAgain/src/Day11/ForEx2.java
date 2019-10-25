package Day11;

import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first number:");
        int b = scanner.nextInt();
        System.out.println("Provide second number;");
        int a = scanner.nextInt();


        for (int i = b; i <= a; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }


    }
}
