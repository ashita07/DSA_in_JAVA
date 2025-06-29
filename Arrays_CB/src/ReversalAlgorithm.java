import java.util.Arrays;

public class ReversalAlgorithm {
    public static void main(String[] args) {
        int[] a={3,5,6,2,1,4,5};
        int k=3;
        Rotate(a,k);
        System.out.println(Arrays.toString(a));
    }
    public static void Rotate(int[] a,int k){
        int n=a.length;
        reverse(0,n-1-k,a);
        reverse(n-k,n-1,a);
        reverse(0,n-1,a);
    }
public static void reverse(int c,int b,int[] a){
    int p1=c;
    int p2=b;
    while(p1<p2){
        int x =a[p1];
        a[p1]=a[p2];
        a[p2]=x;
        p1++;
        p2--;
    }
}

}