public class CanPlaceFlowers {
    public static void main(String[] args) {
        int [] arr={0,1,0,0,0,1,0,0,0,0};
        int ans=3;
        System.out.println(find(arr,ans));
    }
     public static boolean find(int[] arr,int ans) {
        int c=0;
        if(ans==0){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && (i==0 || arr[i-1]==0) && ( i==arr.length-1 || arr[i+1]==0)){
                c++;
                if(c==ans){
                    return true;
                }
                i++;
            }

        }

        return false;
    }
}
