
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  //      Scanner sc=new Scanner(System.in);
    //    String a=sc.nextLine();
      //  System.out.println(a);
        String s= "codingblocks";
        System.out.println(Unique(s));

    }

    public static boolean Unique(String s) {
        int[] frq = new int[26];
        for (int  i = 0;  i < s.length();  i++) {
            int ch =s.charAt(i)-'a';
          //  System.out.println(ch);
            frq[ch]++;
        }
        for(int i = 0; i < frq.length; i++) {
            if(frq[i]>1){
                return false;
            }
        }
 return true;
    }
}