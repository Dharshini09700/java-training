import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int s = sc.nextInt();
            for (int i = 0; i < s; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (x == a) {
                    x = b;
                }
                else if (x == b) {
                    x = a;
                }
            }
            System.out.println(x);
        }
    }
}
