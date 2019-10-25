package Day9;

public class Test9 {
        //what is the output here
        public static void main(String[] args) {
            int a = 2;
            int b = 5;

            // here the question mark means if
            // : symbol means else
            int min = (a <= b) ? a : b;

            if (a <= b) {
                min = a;
            } else {
                min = b;
            }

            System.out.println(min);
            int val1 = 10;
            int val2 = 20;
            int min1 = (val1 <= val2) ? val1 : val2;
            System.out.println(min1);
            int max1 = (val2 >= val1) ? val2 : val1;
            System.out.println(max1);


            //find out max number between two inputs, use user input and ternary operator

//    int max =
//    output
//    20

    }
}
