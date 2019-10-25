package Day11;

import java.util.Scanner;

public class WhileLoopsTask1 {
        // Part1, write a program which asks you to provide a text
        // and it should stop when you type "quit"

        // Part2, continue part1 but also check for length() of string
        // if length is bigger than 10, program should say that string is too large
        // ex:
        // in the while loop....
        //     wjherjwhejrhwejrh => "string is too large"

        // part3 continue part2,if provided string is equals to your name
        // program should print your surname
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Write a string");
            String line = scan.nextLine();

            //part1
            while (!line.equals("quit")) { //s != "exit"
                System.out.println("Write a string");
                line = scan.nextLine();

                //part2
                if(line.length() >= 10){
                    System.out.println("string is too large");
                }
                else if (line.equals("asdf")) {
                    System.out.println("Your surname is Sffasgf");
                }

                //part3
            }
        }
}
