import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args){
        int number[],size,smallest;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array");
        size=sc.nextInt();

        number=new int[size];
        System.out.println("enter the element of array");

        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        smallest=number[0];
        for(int i=0;i<number.length;i++){
            if (smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest value is :"+smallest);
    }
}
