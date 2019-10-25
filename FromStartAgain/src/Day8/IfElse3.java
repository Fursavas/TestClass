package Day8;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //write a program that print temperature in human readable words
        //ex: 70 => hot
        System.out.println("provide the temperature");
        int temperature = scan.nextInt();
        if(temperature >= 70){
            System.out.println("Hot");
        }else if(temperature < 70 && temperature >= 50){
            System.out.println("Warm");
        }else if (temperature < 50 && temperature >= 20){
            System.out.println( "its cold");
        }else {
            System.out.println("its freezing");
        }
        // cold
        // freezing

    }
}
