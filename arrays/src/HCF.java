public class HCF {
    public static void main(String[] args) {
        int ans=calcGCD(72,72);
        System.out.println(ans);
    }
    public static int calcGCD(int n, int m){
        // Write your code here.
        int d=0,q=0;
        if(n>=m)
        {  d=n;
            q=m;}
        else {
            d=m;
            q=n;}
        int rem=0;
        while(d%q!=0){
            rem=d%q;
            d=q;
           q=rem;
        }
        return q;
    }
}
