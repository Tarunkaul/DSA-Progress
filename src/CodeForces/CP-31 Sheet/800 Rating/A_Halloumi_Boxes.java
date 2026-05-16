import java.util.*;
public class A_Halloumi_Boxes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
    
        public static void solve(Scanner sc) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            if(k > 1) System.out.println("YES");

           else {
            boolean sorted = true;
            for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted ? "YES" : "NO");
        }
    }
}