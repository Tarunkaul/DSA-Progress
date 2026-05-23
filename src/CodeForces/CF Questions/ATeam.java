import java.util.*;

public class ATeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans =0;
        int t = sc.nextInt();
        while (t-- > 0) {
            ans += solve(sc);
        }
        System.out.println(ans);
    }

    public static int solve(Scanner sc) {
        int count = 0;
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==1){
                count++;
            }
        }
        int ans = 0;
        if(count > 1) ans = 1;
        return ans;
    }
}