package Day5;

import javax.swing.*;

public class Sdsa {
    public static void main(String[] args) {


        int b = 5;
        int a;
        a = 12;
        b = 64;
        a *=3;
        kR(a, b);
    }

    private static void kR(int a, int b) {
        int c = b + a;
        System.out.println(b = c + a);

        if (c == b + a)
            System.out.println(true);
        else
            System.out.println(false);

        {ifItsTrue(true);
        ifItsFalse(false);}

    }

    private static void ifItsTrue(boolean b) {
        System.out.println("you are in");
    }

    private static void ifItsFalse(boolean b) {
        System.out.println("try again");
    }

}
