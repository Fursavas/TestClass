package Day14;

public class ArrayForLoops {
    public static void main(String[] args) {
        int[] myArray = {2, 11, 45, 9, 56};

        //i starts with 0 as array index starts with 0 too
        int max = myArray[0];
        int min = myArray[0];
        //the task is to find and print out the maximum element
        for (int i = 0; i < myArray.length; i++) {


            if (myArray[i] > max)
                max = myArray[i];
            if (myArray[i] < min)
                min = myArray[i];

        }
        System.out.println(max);
        System.out.println(min);

    }
}
