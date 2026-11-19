import java.util.Scanner;
public class Main{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            double val = Math.pow(0.143 * n, n);
            long ans = Math.round(val);
            System.out.println(ans);
        }
    }
}
