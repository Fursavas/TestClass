package Day10;

public class ForLoopsInJava2 {
    public static void main(String[] args) {

        int x = 6;
        x--; //which means the same thing as x = x - 1;
        x++; //which means the same thing as x = x + 1;

        x += 2; //which means the same thing as x = x + 2;
        x -= 2; //which means the same thing as x = x - 2;

        x += 3; //which means the same thing as x = x + 3;

        //i++ means the same thing as i = i + 1;
        //i
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            int numbers = i;

        }
    }
}
