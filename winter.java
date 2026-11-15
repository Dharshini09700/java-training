import java.util.Scanner;
public class Main{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] l = new int[n];
            int[] g = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                g[i] = sc.nextInt();
            }
            boolean front = true;
            boolean back = true;
            
            for (int i = 0; i < n; i++) {
                if (l[i] > g[i]) {
                    front = false;
                }
                if (l[i] > g[n - 1 - i]) {
                    back = false;
                }
            }
            if (front && back) {
                System.out.println("both");
            } else if (front) {
                System.out.println("front");
            } else if (back) {
                System.out.println("back");
            } else {
                System.out.println("none");
            }
        }
    }
}
