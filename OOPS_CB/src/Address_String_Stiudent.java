public class Address_String_Stiudent {
    int age=20;
    String name = "ashita";
@Override
    public String toString(){
        return this.age+" "+this.name;
    }

    public static void main(String[] args) {
        Student s=new Student();
        String s1 = "KAJU";
        System.out.println(s);
        System.out.println(s1);
    }
}
