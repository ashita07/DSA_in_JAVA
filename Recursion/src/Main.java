import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
      Parenthesis(n,0,0,"",ll);
        System.out.println(ll);
    }
    public static void Parenthesis(int n,int open, int close,String ans,List<String> ll)
    {
if(open ==n&& close==n){
   // System.out.println(ans);
ll.add(ans);
}
if(open>n || close>open){
    return;
}
Parenthesis(n,open+1,close,ans+"(",ll);
Parenthesis(n,open,close+1,ans+")",ll);
    }
}