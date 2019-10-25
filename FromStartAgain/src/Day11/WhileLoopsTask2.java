package Day11;

import java.util.Scanner;

public class WhileLoopsTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("write a text");
            String line = scanner.nextLine();
            if (line.equals("quit")) {
                break;
            }
            if (line.contains("#") && line.contains("$") && line.contains("*")) {
                System.out.println("Strong password");
            }
            else {
                System.out.println("Weak password");
            }
        }
        System.out.println("Hello, World");

    }
}
