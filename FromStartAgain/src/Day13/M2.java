package Day13;

import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // we are putting this inorder to read string as a scanner...
        String s = scan.nextLine();

        // Write your code here.


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
