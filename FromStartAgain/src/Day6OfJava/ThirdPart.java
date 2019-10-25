package Day6OfJava;

public class ThirdPart {
    public static void main(String[] args) {
        System.out.println("-------example1---------");
        String s1 = "hello";
        System.out.println(s1.indexOf("ello"));

        System.out.println("-------example2---------");
        String s2 = "Techno Study";
        int indexs2 = s2.indexOf("no");
        System.out.println(indexs2);

        System.out.println("-------example3---------");
        String s3 = "so something so many";
        int indexs3 = s3.indexOf("so");
        System.out.println(indexs3);

        //Task 1: write code that count length of string and prints sum of length and index of "e"
        //    ex: "techno" => 6+1 => 7
        //    hint: length(), indexOf()
        System.out.println("-------task1---------");
        String s4 = "Techno";
        int indexs4 = s4.indexOf("e");
        int lenght1 = s4.length();
        int sum = indexs4 + lenght1;
        System.out.println(sum);

        System.out.println("-------example4---------");

        String str = "techno study";
        int length = str.length(); // 12
        int index = str.indexOf("e"); // 1

        int sum1 = length + index;
        System.out.println(sum1);


    }

}
