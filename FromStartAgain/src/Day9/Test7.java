package Day9;

public class Test7 {
    public static void main(String[] args) {
        int x = 10;
            final int y = 20;
            switch (x) {
                case 10:
                    System.out.println("HELLO");
                    break;
                case y: //"y" is here commanded final and final is protected that's why its works without any issue
                    System.out.println("TECHNO");
                    break;
            }
    }
}
