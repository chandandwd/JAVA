import java.util.*;
public class stringrep0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0, k = 0;
        char[] arr = new char[str.length()];
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                {
                    cnt++;
                    if (cnt>0){
                        arr[k++] = '0';
                    }
                    else{
                        arr[k++] = str.charAt(i);
                    }
                }      
            }

             
        }
        for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);}
    }
    
}
