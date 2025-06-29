public class DiceSum {
    public static void main(String[] args) {
        Sum(4,0,"");
    }
    public static void Sum(int target,int sum,String s){
        if(sum==target){
            System.out.print(s+" ");
            return;
        }
        if(sum>target)
            return;
        Sum(target,sum+1,s+"1");
        Sum(target,sum+2,s+"2");
        Sum(target,sum+3,s+"3");

    }
}
