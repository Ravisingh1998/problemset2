public class reversefor{
    public static void main(String[] args){
        int n=231;
        int i,rem,rev=0;
       for(n=0;n<0;n--){
            rem=n%10;
            rev=rev%10+rem;
           n= n/10;

       }
        System.out.println( +n);



    }
}
