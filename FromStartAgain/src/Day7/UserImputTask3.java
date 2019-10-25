package Day7;

import java.util.Scanner;

public class UserImputTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int n1 = scan.nextInt();
        if (n1 == 0) {
            System.out.println(n1 + " is zero");
        }
        else if (n1 == 1) {
            System.out.println(n1 + " is one");
        }
        else if (n1 == 2) {
            System.out.println(n1 + " is two");
        }
        else if (n1 == 3) {
            System.out.println(n1 + " is three");
        }
        System.out.println("-------other--------");
        System.out.println("Enter your text");

        String s1 = scan.next();

            if (s1 == "zero") {
                System.out.println(s1 + "is 0");
            } else if (s1 == "one") {
                System.out.println(s1 + "is 1");
            } else if (s1 == "two") {
                System.out.println(s1 + "is 2");
            } else if (s1 == "three") {
                System.out.println(s1 + "is 3");
            }


    }
}

