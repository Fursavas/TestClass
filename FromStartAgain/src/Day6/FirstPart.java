package Day6;

public class FirstPart {
    public static void main(String[] args) {
        int kial1 = 15;
        int kial2 = 15;

        System.out.println(kial1);
        System.out.println(kial2);

        // i know not
        TestComparingOperators(kial1, kial2);
    }

    private static void TestComparingOperators(int k1, int k2) {

        if (k1 == k2) {
            System.out.println("number are equal");
        }
        else {
            System.out.println("number are not equal");
        }
        add(k1, k2);


    }

    private static void add(int k1, int k2) {
    }

}
