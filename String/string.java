import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char [] arr = new char[n-1];
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) =='3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) =='7' || s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0'){
                arr[j++] = s.charAt(i);
            }
        }
        for (char a : arr){
            System.out.print(a);
        }
        sc.close();
    }
}
