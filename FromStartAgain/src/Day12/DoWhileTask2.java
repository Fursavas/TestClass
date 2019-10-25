package Day12;

import java.util.Scanner;

public class DoWhileTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pin = "";
        do {
            System.out.println("Write your PIN: ");
            pin = scanner.nextLine();
            if (3 <= pin.length() || pin.length() >= 5) {
                System.out.println("Wrong combination, please use 4 digit number!");
            }

        } while (!pin.equals("9999"));
        System.out.println("TAk your card");
    }
}
