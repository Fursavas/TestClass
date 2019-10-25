package Day7;

public class MathRandom {
    public static void main(String[] args) {
        //Random numbers in java use Math.random()
        System.out.println(Math.random()); // to print random

        int min = 0;
        int max = 3;
        int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(randomInRange);
        if (randomInRange == 0){
            System.out.println("number is Zero");
        }
        if (randomInRange == 1){
            System.out.println("number is One");
        }
        if (randomInRange == 2){
            System.out.println("number is Two");
        }
        if (randomInRange == 3){
            System.out.println("number is Three");
        }


//        String v6 = "160.95";
//        double price = Double.valueOf(v6);
//        //range 1 - 10
//        double quantity = randomInRange;
//
//        boolean checkingPrice = price * quantity == 321.9;
        //Random numbers in java use Math.random()

        double random = Math.random(); // 0.000000001 - 0.9999999999
        System.out.println(random);

        System.out.println(random * max);
        //        int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println("Task 1: -------------------");
        //TODO task1: print random integer number between 0 and 100
        int max2 = 100; // declaring integer max with value 10
        double r2 = random * max2; // gets random double between 0 - "max"
        int i2 = (int) r2; // gets integer form double
        System.out.println(r2); //printing double r1
        System.out.println(i2); //printing integer i1
        System.out.println((int)(Math.random()*100)); //shortcut printing random
    }
}
