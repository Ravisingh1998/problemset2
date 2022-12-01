import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args){
     int number[],size,largest;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array");
        size=sc.nextInt();

        number=new int[size];
        System.out.println("enter the element of array");

        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        largest=number[0];
        for(int i=0;i<number.length;i++){
            if (largest<number[i]){
                largest=number[i];
            }
        }
        System.out.println("largest value is :"+largest);
    }
}
