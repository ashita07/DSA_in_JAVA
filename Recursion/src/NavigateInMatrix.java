public class NavigateInMatrix {
    public static void main(String[] args) {
        int row = 4;
        int column=3;
        Destination(0,0,"",row,column);
    }

    public static void Destination(int col,int row,String ans , int r,int c) {
        if(row==r-1 && col==c-1){
            System.out.println(ans);
            return ;
        }
        if(row>r-1 || col>c-1){
            return;
        }
        Destination(col+1,row,ans+"H",r,c);
        Destination(col,row+1,ans+"V",r,c) ;
    }
}
