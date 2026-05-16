import java.util.*;

public class AWatermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       solve(sc);
    }

    public static void solve(Scanner sc) {
        int in = sc.nextInt();
        if(in % 4 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}