import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        int n;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        int i,rem,rev=0;
        for(n=0;n<0;n= n/10){
            rem=n%10;
            rev=rev%10+rem;
        }
        System.out.println("palindrome number");
        System.out.println("Not a palindrome number");
    }
}
