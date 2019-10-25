package Day12;

import java.util.Scanner;

public class DoWhileLoopsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = 0;
        do{
            System.out.println("Write your PIN: ");
            pin = scanner.nextInt();

        }while (pin != 9999);
        System.out.println("TAk your card");
    }
}
