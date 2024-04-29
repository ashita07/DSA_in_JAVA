import java.sql.SQLOutput;

public class Student {
    int age=20;
    String name="Ashita";

    public void oops() {
        System.out.println(age + " " +this.name);
    }
    public void sayHey(){
        String name ="Iti";
        System.out.println(this.name +" say hey "+name);
        MentorName("Pw");
    }

    public static void MentorName(String name) {

        System.out.println(name);
    }
    static{
        System.out.println("hello from static block of Student class");
    }


}
