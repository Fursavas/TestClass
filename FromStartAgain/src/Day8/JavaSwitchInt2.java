package Day8;

import java.util.Scanner;

public class JavaSwitchInt2 {
    public static void main(String[] args) {
        System.out.println("type your number");
        Scanner scan = new Scanner(System.in);
        int numberOFDayOfWeek = scan.nextInt();


        switch (numberOFDayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("invalid number");
        }

        System.out.println("--------other---------");

        String nameOfTheWeekdays = scan.next();
        switch (nameOfTheWeekdays) {
            case "Monday":
                System.out.println("1. day");
                break;
            case "Tuesday":
                System.out.println("2. day");
                break;
            case "Wednesday":
                System.out.println("3. day");
                break;
            case "Thursday":
                System.out.println("4. day");
                break;
            case "Friday":
                System.out.println("5. day");
                break;
            case "Saturday":
                System.out.println("6. day");
                break;
            case "Sunday":
                System.out.println("7. day");
            default:
                System.out.println("invalid word");

        }

    }
}

