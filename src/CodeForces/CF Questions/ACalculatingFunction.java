import java.util.*;

public class ACalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long output = 0;
            if(t % 2 == 0){
                output = t /2;
            } else {
                output += (-(t+1)/2);
            }
        System.out.println(output);
    }
}