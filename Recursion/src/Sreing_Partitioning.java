import java.util.ArrayList;
import java.util.List;

public class Sreing_Partitioning {
    public static void main(String[] args) {
        String ques="ashita";
        List<String> ll=new ArrayList<>();
        Partition(ques,"",ll);
    }
    public static void Partition(String ques,String ans,List<String> ll){
        if(ques.isEmpty()){
            System.out.println(ll);
            return;
        }
        for (int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            ll.add(s);
            Partition(ques.substring(i),ans+s+"|",ll);
            ll.remove(s);
        }
    }
}
