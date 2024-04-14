public class Binary_Recursion {
    public static void main(String[] args) {
        int A[]={4,6,7,9,56,77,89,123};
        int target =123;
        int lb =0;int ub=A.length-1;
 int ans= BS(A,target,lb,ub);
        System.out.println(ans);
}
static int BS(int[] A,int target,int lb,int ub) {
    int mid;
    if(ub<lb)
    {  return -1;}

    mid = lb + (ub - lb) / 2;
    if (A[mid] == target)
    { return mid;}
    else if (A[mid] > target)
    { return  BS(A, target, lb,mid-1);}
    else
    { return BS(A, target,mid+1,ub);}

}
    }