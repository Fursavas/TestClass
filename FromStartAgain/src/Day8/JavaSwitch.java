package Day8;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {
        System.out.println("type your grade");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();


        switch (grade){
            case "A":
                System.out.println("excellent");
                break;
            case "B-":
            case "B":
            case "B+":
                System.out.println("good");
                break;
            case "C-":
            case "C":
            case "C+":
                System.out.println("middle");
                break;
            case "D-":
            case "D":
            case "D+":
                System.out.println("pass");
                break;
            case "F":
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid grade");

        }
    }
}
