package JAVA.Function;
import java.util.*;
public class Sum {

    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter b number : ");
        int n2 = sc.nextInt();
        int summ = n1+n2;
        System.out.println("The Sum is "+summ);
    }
}