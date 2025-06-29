import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int c3 =sc.nextInt();
        int c4=sc.nextInt();
        int n =sc.nextInt();
        int m =sc.nextInt();
        int [] rikshaw_ride=new int[n];
        int[] cab_ride=new int[m];
        for(int i=0;i<rikshaw_ride.length;i++){
            rikshaw_ride[i]=sc.nextInt();
        }
        for(int i=0;i<cab_ride.length;i++){
            cab_ride[i]=sc.nextInt();
        }
        System.out.println(mininumSum(c1,c2,c3,c4,rikshaw_ride,cab_ride));
        t--;}
    }
    public static int mininumSum(int c1,int c2,int c3,int c4,int[] rikshaw_ride,int[] cab_ride){
        int rikshaw_Cost=0;
        for (int i=0;i<rikshaw_ride.length;i++){
            rikshaw_Cost=rikshaw_Cost+Math.min(rikshaw_ride[i] * c1,c2);
        }
        rikshaw_Cost=Math.min(rikshaw_Cost,c3);
        int cab_cost=0;
        for(int i=0;i<cab_ride.length;i++){
            cab_cost=cab_cost+Math.min(cab_ride[i]*c1,c2);
        }
        cab_cost=Math.min(cab_cost,c3);
        int totalCost=rikshaw_Cost+cab_cost;
        return Math.min(totalCost,c4);
    }
}
