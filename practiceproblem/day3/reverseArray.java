import java.sql.SQLOutput;

public class reverseArray {
    public static void main(String[] args){
        int arr1[]=new int[]{1,2,3,4,5,7};// original array taken
        System.out.println("print original value : ");

        for(int i=0;i<arr1.length;i++)// first loop or print each element
        {
         System.out.println(arr1[i]);// print the values
     }
        System.out.println();
        System.out.println("reverse the array is :");//print the reverse array
        for(int i=arr1.length-1;i>=0;i--)// 2nd for use to print start from last index of array
        {
            System.out.println(arr1[i] +" ");
        }
    }
}
