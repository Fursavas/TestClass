package Day6OfJava;

public class FirstPart {
    public static void main(String[] args) {
        String s1 = "sda";
        String s2 = "sda";
        String s3 = "sda";

        if (s1 == s2) {
            System.out.println("it is equal");
        }
        String s4 = new String("asdsda");
        String s5 = new String("asdsda");

        if (s4 == s5) {
            System.out.println("it is equal2");
        }

        String myName = "Faris";
        String mySurname = "Ursavas";
        if (myName.equals("Ursavas")) {
            System.out.println("That's cool");
        } else {
            System.out.println("It's also cool");

        }
    }
}