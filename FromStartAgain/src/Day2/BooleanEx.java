package Day2;

public class BooleanEx {
    public static void main(String[] args) {
        boolean correctUsername = true;
        boolean correctPassword = true;
        boolean wrongPassword = false;
        boolean wrongUsername = false;
        System.out.println(correctPassword && correctUsername);
        System.out.println(correctPassword && wrongUsername);
        System.out.println(wrongPassword && correctUsername);
        System.out.println( wrongPassword && wrongUsername);
    }
}
