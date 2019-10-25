package Day7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int n1 = scan.nextInt();
        System.out.println("First number is -"+ n1 + "-");
        System.out.println("Enter your second number");
        int n2 = scan.nextInt();
        System.out.println("Second number is -"+ n2 + "-");
        int sum = n1 + n2;
        System.out.println("sum of your numbers is = " + sum);



    }
}
