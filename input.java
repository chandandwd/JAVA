import java.util.Scanner;
public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a = sc.nextInt();
        System.out.println("Enter the second num: ");
        int b = sc.nextInt();
        System.out.println("The sum is: "+(a+b));
        System.out.println("The difference  is: "+(a-b));
        System.out.println("The product is: "+(a*b));
        System.out.println("The a/b is: "+(a/b));

    }
}