import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                long x = a - 1;
                long y = m - a;

                sum += Math.max(x, y);
            }
            System.out.println(sum);
        }
    }
}
