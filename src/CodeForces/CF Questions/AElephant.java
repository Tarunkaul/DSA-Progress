import java.util.*;

public class AElephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int steps = 0;
        while(t > 0){
            t -= 5;
            steps++;
        }
        System.out.println(steps);
    }
}