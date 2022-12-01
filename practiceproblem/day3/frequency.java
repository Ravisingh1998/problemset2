import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the element of array ");
        int n=sc.nextInt();//suppose user given value 5
        int a[]=new int[n];// two array a and b size is given by user
        int b[] =new int[n];
        int c=0;
        for(int i=0;i<n;i++){ // use input a number
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)// first i value is zero
        {
            c=1;
            if(a[i]!=-1)// a[0] !=-1
            {
                for(int j=i+1;j<n;j++)// here j is increase by one because i value is zero
                {// when j value is two then condition are true
                    if(a[i]==a[j])// a[0]==a[1]
                    {
                        c=c+1;
                        a[j]=+-1;
                    }
                }
                b[i]=c;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]!=-1){
                System.out.println(a[i] +" "+b[i]);
            }
        }
    }
}
