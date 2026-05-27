import java.util.*;

public class BDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double ans = (double)sum / arr.length;
       System.out.printf("%.12f%n", ans);

    }
}