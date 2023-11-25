import org.w3c.dom.ls.LSOutput;

public class Main {
    static int a=29;
    public static void main(String[] args)
    {
        System.out.println(a);
        a=33;
        System.out.println(a);
        System.out.println("Hello world!");
        a();
    }

     static void a() {
        System.out.println(a);
    }
}