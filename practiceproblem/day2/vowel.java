import java.util.Scanner;

public class vowel {
    public static void main(String []args){
       // a e i o u these are vowel and rest of alphabet are consonant.
        Scanner sc = new Scanner(System.in);// use input
        char  ch=((sc.nextLine()).charAt(0));// declare char
         switch (ch){
             case'a':
             case'e':
             case'i':
             case'o':
             case'u':
                 System.out.println(ch +"vowel");
                 break;
             default:
                 System.out.println(ch +"consonant");
         }
    }
}
