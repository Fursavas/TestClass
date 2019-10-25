package Day10;

public class ForLoopInjava {
    public static void main(String[] args) {

        int a;
        a = 1;
        System.out.println(a);
        a = 2;
        System.out.println(a);
        a = 3;
        System.out.println(a);
        a = 4;
        System.out.println(a);
        a = 5;
        System.out.println(a);

        forLoopExample();

    }

    private static void forLoopExample()  {
        for (int i= 5; i>=0; i-=2) {
            System.out.println(i);
            //System.out.println(bigI);// it doesnt read this becauise of its not inside of loop
        }

    }

}
