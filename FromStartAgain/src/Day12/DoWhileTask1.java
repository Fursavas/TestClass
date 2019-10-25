package Day12;

import java.util.Scanner;

public class DoWhileTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = 0;
        do{
            System.out.println("Write your PIN: ");
            pin = scanner.nextInt();
            if (10000 <= pin || pin >= 999){
                System.out.println("Wrong combination, please use 4 digit number!" );
            }

        }while (pin != 1234);
        System.out.println("TAk your card");
    }
}
