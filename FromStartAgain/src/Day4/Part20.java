package Day4;

public class Part20<TestComparisonOperators> {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 5;
        char let1 = 'z';
        char let2 = 'z';

        TestComparisonOperators(num1, num2);
        Add(let1, let2);

    }

    private static void TestComparisonOperators(int num1, int num2) {
        String a = "Numbers are equal";
        String b = "Numbers are not equal";

        if (num1==num2) // or if (num1!=num2)
            System.out.println(a);
        else {
            System.out.println(b);
        }


    }

    private static void Add(char let1, char let2) {
        String a = "Letters are equal";
        String b = "Letters are not equal";

        if (let1!=let2)
        System.out.println(b);
        else
        System.out.println(a);
    }

}


// void = no return
//
//
//
//
//
//