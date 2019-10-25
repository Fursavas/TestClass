package Day11;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 1; i <= a * b; i++) {
            System.out.println(b * i);
        }
    }
}
