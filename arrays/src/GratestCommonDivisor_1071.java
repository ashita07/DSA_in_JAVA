public class GratestCommonDivisor_1071 {
    public static void main(String[] args) {
        System.out.println(CommonD("abababababab","ababab"));
    }
    public static String CommonD(String str1,String str2){
       if(str1.length()==str2.length()){
           return str1;
       }
       if(str1.length()<str2.length()){
           return CommonD(str2,str1);
       }
        return CommonD(str1.substring(str2.length()), str2);

    }
}
