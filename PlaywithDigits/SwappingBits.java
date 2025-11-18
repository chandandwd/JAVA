import java.util.*;
public class SwappingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        int k = 0;
        int p = 0;
        int d = 0;
        int num = sc.nextInt();
        while(num>0){
            int r = num%2;
            num = num/2;
           arr[k++] = r;}
    
    for(int i = 0 ; i < arr.length; i+=2){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    for(int i = 0;i < arr.length-1; i++){
        d += arr[i]*(int)Math.pow(2,p++);   
    }
    System.out.println(d);

}
}
