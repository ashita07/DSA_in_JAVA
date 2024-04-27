public class Leetcoe121_Split {
    public static void main(String[] args) {
       String s="the sky is pink";
            String ans ="";
            s=s.trim();
            String[] str = s.split(" +");
            for(int i=str.length-1;i>=0;i--){
                ans+=str[i]+" ";
            }
        System.out.println(ans.trim());

    }
}
