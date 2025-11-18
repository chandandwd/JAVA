import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int  i = 1; i<n+1; i++){
            for(int j = 1; j<n+1; j++){
                if(i+j<n+1){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int k = 1; k<i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
 