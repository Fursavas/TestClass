package Day11;

import java.util.Scanner;

public class WhileLoopsTask3 {
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
            if (line.equals(line.toUpperCase())){
                System.out.println("");
            }
             else {
                System.out.println("You should write with uppercase letters");
            }

        }
    }
}
