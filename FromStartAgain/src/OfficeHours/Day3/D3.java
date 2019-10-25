package OfficeHours.Day3;

import java.util.Random;

public class D3 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            total = total + i;
            System.out.println("total is here => " + total);

        }


        System.out.println("----------2-----------");


        Random rnd = new Random();

        int total2 = 0;

        for (int i = 0; i < 3; i++) {

            int num = rnd.nextInt(30);


            System.out.println("num is here " + num);

        }
        System.out.println("total2 is here => " + total2);

        System.out.println("----------3-----------");

        int j = 1;
        while (j < 10){
            int num = j*5;
            System.out.println(num);
            j++;
        }
    }

}
