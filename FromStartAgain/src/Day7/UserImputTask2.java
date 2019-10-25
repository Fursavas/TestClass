package Day7;

import java.util.Scanner;

public class UserImputTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int n1 = scan.nextInt();
        if (n1 > 0) {
            System.out.println(n1 + " is positive");
        }
        if (n1 < 0) {
            System.out.println( n1 + " is negative");
        }
        if (n1 == 0) {
            System.out.println(n1 + " is neutral");
        }
    }
}
