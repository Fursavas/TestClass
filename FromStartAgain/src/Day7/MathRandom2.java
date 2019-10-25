package Day7;

public class MathRandom2 {
    public static void main(String[] args) {
        double min = 0;
        double max = 10;
        double rN = Math.random();
        System.out.println(rN);
        System.out.println(rN*max);
        double rN2 = Math.random();
        System.out.println(rN2);
        System.out.println(rN2*max);
        int i1 = (int) (rN*max);
        int i2 = (int) (rN2*max);
        System.out.println(i1 + "\n" + i2);



    }
}
