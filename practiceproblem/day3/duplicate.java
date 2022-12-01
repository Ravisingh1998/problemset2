public class duplicate {
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6,2,3,5,8};
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])//if arr[i] equal to arr[j] the print
                {
                    System.out.println("print the duplicate value :" +arr[j]);
                }
            }
        }
    }
}
