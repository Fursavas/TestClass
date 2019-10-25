package Day6OfJava.Forth;

public class Part {
    public static void main(String[] args) {
        String name = "Faris";
        System.out.println(name.replace("Faris", "Ursavas"));
        System.out.println(name);
        if (name == "Faris") {
            System.out.println(name.replace("Faris", "Ursavas"));
        }
        String s1 = "5";
        int a1 = Integer.valueOf(s1);
        String s2 = "22";
        int a2 = Integer.valueOf(s2);
        int a3 = 50;
        double a4 = 2.24;
        int a5 = 50000;
        double sum = a1 + a2 + a3 + a4 + a5;
        double average = sum/5;
        System.out.println(average);

        String s3 = "MiCHale JACKson";
        String c1 = s1.substring(0,7);
        String c2 = s1.substring(7,13);

        System.out.println(s1.substring(7,13));

    }
}
