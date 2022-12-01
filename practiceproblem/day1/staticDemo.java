public class staticDemo {
    static int a=20;
   static  void display()
    {
        System.out.println("static method");

    }
    static
    {
        System.out.println("static block");
    }
    public static void main(String[] a){
        System.out.println(a);
        display();
    }
}
