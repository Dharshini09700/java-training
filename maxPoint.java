import java.util.Scanner;
public class Main{
   public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int maxPoints = 0;
            for (int i = 0; i < n; i++) {
                int points = (a[i] * 20) - (b[i] * 10);
                if (points < 0) {
                    points = 0;
                }
                if (points > maxPoints) {
                    maxPoints = points;
                }
            }
            System.out.println(maxPoints);
        }
    }
}
