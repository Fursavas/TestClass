package Day7;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!!!");

        System.out.println("--------1----------");
        System.out.println("Enter your age");
        int n1 = scan.nextInt();
        if (n1 >= 18) {
            System.out.println("you can join");
        }
        else {
            System.out.println("you need parental approve");
        }

    }
}
