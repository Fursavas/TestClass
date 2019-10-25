package Day10;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Type Your Quiz Score");
        Scanner scan = new Scanner(System.in);
        double quizS = scan.nextDouble();
        System.out.println("Type Your Midterm Score");
        double midTermS = scan.nextDouble();
        System.out.println("Type Your Final Score");
        double finalS = scan.nextDouble();

        double gradeSum = (quizS + midTermS + finalS)/3;

        System.out.println("Your Grade is " + gradeSum);
        if (100 >= gradeSum && gradeSum >= 90) {
            System.out.println("Your Grade is A");
        } else if (89 >= gradeSum && gradeSum >= 87) {
            System.out.println("Your Grade is B+");
        } else if (86 >= gradeSum && gradeSum >= 83) {
            System.out.println("Your Grade is B");
        }else if (82 >= gradeSum && gradeSum >= 80) {
            System.out.println("Your Grade is B-");
        } else if (79 >= gradeSum && gradeSum >= 77) {
            System.out.println("Your Grade is C+");
        }else if (76 >= gradeSum && gradeSum >= 73) {
            System.out.println("Your Grade is C");
        } else if (72 >= gradeSum && gradeSum >= 70) {
            System.out.println("Your Grade is C-");
        } else if (69 >= gradeSum && gradeSum >= 67) {
            System.out.println("Your Grade is D+");
        } else if (66 >= gradeSum && gradeSum >= 65) {
            System.out.println("Your Grade is D");
        } else if (65 > gradeSum) {
            System.out.println("Your Grade is F");
        } else {
            System.out.println("invalid grade");
        }


    }

}
