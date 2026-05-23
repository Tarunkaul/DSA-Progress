import java.util.*;

public class AWayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String s = sc.next();
        if(s.length() <= 10){
            System.out.println(s);
        }else{
            int count = 0;
            for(int i = 1; i < s.length()-1; i++){
                count++;
            }
            s = ""+s.charAt(0)+count+s.charAt(s.length()-1);
            System.out.println(s);
        }
    }
}