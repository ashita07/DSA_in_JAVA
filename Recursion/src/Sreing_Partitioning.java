import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Sreing_Partitioning {
    public static void main(String[] args) {
        String ques="aababb";
        List<List<String>> ll1=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        Partition(ques,"",ll,ll1);
        System.out.println(ll1);
    }
    public static void Partition(String ques,String ans,List<String> ll,List<List<String>> ll1){
        if(ques.isEmpty()){
            ll1.add(new ArrayList<>(ll));
            return;
        }
        for (int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(is_Pallindrome(s)){
                ll.add(s);
                Partition(ques.substring(i),ans+s+"|",ll,ll1);
                ll.removeLast();
            }

        }
    }
  public static boolean is_Pallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) !=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
  }
}
