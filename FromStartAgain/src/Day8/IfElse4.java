package Day8;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write your data type");
        long dataType = scan.nextInt();
        if (dataType >= (-128) && dataType <= (128)){
            System.out.println("it's byte");
        }else if (dataType >= (-32768) && dataType <= (32768)){
            System.out.println("it's short");
        }else if (dataType >= (-2147483648) && dataType < (2147483647)){
            System.out.println("it's int");
        }else {
            System.out.println("it's long");
        }
    }
}
