package Day9;

public class Test8 {
    public static void main(String[] args) {
        int x = 10;
        switch (x + 1 + 1) {
            case 10:
                System.out.println("HELLO");
                break;
            case 10 + 1 + 1: //or just 12
                System.out.println("TECHNO");
                break;
        }
    }
}
