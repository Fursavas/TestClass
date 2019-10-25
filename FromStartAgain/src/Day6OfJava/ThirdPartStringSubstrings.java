package Day6OfJava;

public class ThirdPartStringSubstrings {
    //Substrings
    public static void main(String[] args) {
        //0123456789
        String string1 = "Hello World";
        System.out.println(string1.substring(6)); // World

        System.out.println(string1.substring(0,1)); // H
        System.out.println(string1.substring(6,7)); // W
        System.out.println(string1.substring(10,11)); //

        String string2 = "Faris Ursavas";
        System.out.println(string2.substring(0,1)+string2.substring(6,7));
        System.out.println(string2.substring(0,1)+ "." +string2.substring(6,7) + ".");

        String string3 = "The quick brown fox jump over the lazy dog.";
        System.out.println(string3.substring(10,25));

    }
}
