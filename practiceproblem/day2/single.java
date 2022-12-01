import java.util.Scanner;

public class single {
    public static final String[] Units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static Object convert(final int n) {
       if (n < 0) {
            return"Minus" +convert(n);
        }
        return 0;
    }
    public static void main (String[]args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to conert into word");
        n=s.nextInt();
        System.out.println(convert(n));
    }
}
