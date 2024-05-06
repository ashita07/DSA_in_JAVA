import java.util.Stack;
public class Leetcode2375 {
    public static void main(String[] args) {
        System.out.println(diString("IIIDDIDI"));
    }
    public static String diString(String s){
        int n=s.length();
        int c=1;
        Stack<Integer> st =new Stack<>();
       int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            if( i==s.length() || s.charAt(i)=='I' ){
                arr[i]=c;
                c++;
              while(!st.isEmpty()){
                  arr[st.pop()]=c;
                   c++;
               }
            }
            else{
                st.push(i);
            }
        }
        StringBuilder sc= new StringBuilder();
        for(int i=0;i<arr.length;i++){
           sc.append(arr[i]);
        }
        return sc.toString();
    }

}
