package Day6OfJava;

public class SecondPart {
    public static void main(String[] args) {

        String s1 = "asdasd";
        int l = s1.length();
        System.out.println(l);

        String username = "fransukavoz";
        if (username.length() < 11) {
            System.out.println("you can go on");
        }
        else {
            System.out.println("Your user name is to long for creating new ID");
        }

        String a1 = "asd";
        String a2 = "b";
        int lt = a1.length()+a2.length();
        System.out.println(lt);

        String b1 = "LongStringHere";
        String b2 = "ShortOne";
        int lG = b1.length();
        int lS = b2.length();
        if (lG - lS > 0) {
            System.out.println("we can do it");
        }
        else {
            System.out.println("cannot proceed");
        }

        String c1 = "short";
        String c2 = "loooooooong";
        int kG = c1.length();
        int kS = c2.length();
        if (kG - kS > 0) {
            System.out.println("we can do it");
        }
        else {
            System.out.println("cannot proceed");
        }

    }
}
