package Day13;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Text");
        String st=scan.nextLine();
        char ch[]=st.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='u'||ch[i]=='o'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='U'||ch[i]=='O')
            {
                ch[i]='X';
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
