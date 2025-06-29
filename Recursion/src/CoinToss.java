public class CoinToss {
    public static void main(String[] args) {
        Toss(3,"");
    }
    public static void Toss(int n,String s){
        if(n==0){
            System.out.print(s+" ");
            return;
        }
        Toss(n-1,s+"H");
        Toss(n-1,s+"T");
    }
}
