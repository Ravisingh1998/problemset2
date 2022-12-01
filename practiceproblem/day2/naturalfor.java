import java.util.Scanner;

public class naturalfor {
    public static void main(String[] args){
        int n;
        int i,sum=0;
        System.out.println("Enter the number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
       for(i=1;i<=n;i++)
       {
            sum=sum+i;
            i=i+1;
        }
        System.out.println("ADDITION :" +sum);
    }
}
