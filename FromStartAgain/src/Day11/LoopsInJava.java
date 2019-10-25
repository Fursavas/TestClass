package Day11;

import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {
        for(String s = ""; s.length() <= 10; s = s + "a"){
            System.out.println(s);
        }

        System.out.println("----------2-----------");

        // x = x + y; => x += y;

        for(String s = ""; s.length() <= 3; s += "a"){
            // "" => 0
            // ""+"a"=> "a" => 1
            // "a" + "a" => "aa" => 2
            // "aa" + "a" => "aaa" => 3
            System.out.println(s);
        }

        System.out.println("----------3-----------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number:");
        int number = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(number * i);
        }

        System.out.println("----------4-----------");

        for (int i = 1, j = 2; i <= 10 && j < 5 ; i++, j++) {
            // i = 1, j = 2
            // i = 2, j = 3
            // i = 3, j = 4
            // i = 4, j = 5
            System.out.println(i * j);
        }

        System.out.println("----------5-----------");


        for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.println("i is: " + i);
            System.out.println("j is: " + j);
            System.out.println("k is: " + k);
            System.out.println();
        }

        System.out.println("----------or-----------");

        System.out.println("Example with multiple  declarations,initialiazations and update expressions");

        for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.print("i=" + i);
            System.out.print(" j=" + j);
            System.out.print(" k=" + k);

            System.out.println();
        }

        System.out.println("----------6-----------");



    }

 }

