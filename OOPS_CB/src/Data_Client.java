public class Data_Client {
    public static void main(String[] args) {
        Data d=new Data();
        int a=d.getValue();
        System.out.println(a);
        d.setValue(30);
        System.out.println(d.getValue());
    }
}
