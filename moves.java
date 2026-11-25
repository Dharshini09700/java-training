import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int minMoves = (n + 1) / 2;
            if (k >= minMoves && k <= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
