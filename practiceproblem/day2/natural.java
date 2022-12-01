import java.util.Scanner;

public class natural {
    public static void main(String[] args){
        int n,i,sum=0;
        System.out.println("Enter the number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        i=1;
      while(i<=n){
          sum=sum+i;
          i=i+1;
      }
        System.out.println("ADDITION" +sum);
    }
}


