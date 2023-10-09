import java.util.Scanner;

public class Percentage_of_students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        for (int i = 1; i <= 5; i++) {


            System.out.println("Enter the Marks ");
            System.out.print(i);
            int a = sc.nextInt();
            sum1 = sum1 +a;
        }
        int summation = (sum1/5);
        System.out.print("Percentage of the student is ");
        System.out.println(summation);

    }
}
