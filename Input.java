
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum of these three number is: ");
        System.out.println(sum);
//        String str = sc.next();
        Scanner ssc = new Scanner(System.in);
        System.out.println("Enter name");
        String strong = ssc.nextLine();
        System.out.println(strong);

    }
}
