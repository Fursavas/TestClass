package Day10;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your size");
        int size = scanner.nextInt();

        switch (size) {
            case 4:
                System.out.println("size is small");
                break;
            case 6:
                System.out.println("size is medium");
                break;
            case 10:
                System.out.println("Size is large");
                break;
            case 12:
                System.out.println("size is X-large");
            default:
                System.out.println("size is not small,medium,large or X-large,but was");
                break;


        }
    }
}

