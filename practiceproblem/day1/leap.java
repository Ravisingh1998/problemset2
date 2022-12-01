public class leap {
    // two condition for the leapyear 1st is a year should always ddivided by 4 or 400

    // a number is divided by 4 or 400 but not divided by 100.
    public static void main(String[] args) {
        int year = 1582;

        if (year%400 == 0)||(year%4==0) && (year % 100!=0 )
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}

