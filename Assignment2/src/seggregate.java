import java.util.Scanner;

public class seggregate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int sum = 0, sum2 = 0, sum3 = 0;
        while (true) {
            System.out.println("enter the number");
            N = sc.nextInt();
            if (N < 0) {
                sum = sum + N;
            }
            if (N > 0 && N % 2 == 0) {
                sum2 = sum2 + N;

            }
            if (N > 0 && N % 2 != 0) {
                sum3 = sum3 + N;
            }

            if (N == 0)
                break;
        }
            System.out.println(sum);
            System.out.println(sum2);
            System.out.println(sum3);



    }
}
