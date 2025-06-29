public class SubSequence {
    public static void main(String[] args) {
  Print("abcd", "");
    }
    public static void Print(String s,String ans){
        if(s.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
       char ch=s.charAt(0);
        Print(s.substring(1),ans);
        Print(s.substring(1),ans+ch);
    }
}
