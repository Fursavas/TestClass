package Day11;

import java.util.Scanner;

public class ForEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide max number:");
        int max = scanner.nextInt();
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum = sum + i; //sum+=i
            counter++;
            System.out.println(counter);
        }
        System.out.println("Sum is :" + sum);
        System.out.println("counter is:" + counter);
        System.out.println("Avarage is:" + (double) sum / counter);
    }
}
