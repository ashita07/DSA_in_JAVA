public class Substring {
    public static void main(String[] args) {
        String st = "abc";
        for (int i = 0; i < st.length(); i++) {
            for (int j=i;j<=st.length();j++){
                System.out.print(st.substring(i,j) +" ");
            }
        }
    }
}
