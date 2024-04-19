import java.util.ArrayList;
import java.util.List;

public class Lexiocgraphical {
    public static void main(String[] args) {
        int n=13;
        List<String> ll=new ArrayList<>();
        lexi(0, n,ll);
        System.out.println(ll);
    }

    public static void lexi(int curr,int n,List<String> ll) {
        if(curr>n){
            return ;
        }
        System.out.println(String.valueOf(curr));
        ll.add(String.valueOf(curr));
        int i=0;
        if(curr==0){
             i=1;
        }
        for (; i <=9 ; i++) {
            lexi(curr*10+i,n,ll);
        }
    }
}
