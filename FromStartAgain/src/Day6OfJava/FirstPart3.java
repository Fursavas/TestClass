package Day6OfJava;

public class FirstPart3 {
    public static void main(String[] args) {
        String a1 = "Hello";
        String a2 = "World";
        System.out.println(a1 + a2);

        String s1 = "What";
        String s2 = "is";
        String s3 = "your";
        String s4 = "name";
        String s5 = "?";
        String s6 = "\n";

        System.out.println(s1+" "+s2+" "+s3+" "+s4+s5);
        System.out.println(s1 + s6 + s2 + s6 + s3 + s6 +s4+s5);
        // or write concat
        System.out.println(s1.concat(s2));

    }
}
