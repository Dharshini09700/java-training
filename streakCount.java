import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int c1 = 0;
            int c2 = 0;
            int max1 = 0;
            int max2 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(a[i]>0){
                    c1 += 1;
                    if(max1 < c1){
                        max1 = c1;
                    }
                }
                else{
                    c1 = 0;
                }
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
                if(b[i]>0){
                    c2 += 1;
                    if(max2 < c2){
                        max2 = c2;
                    }
                }
                else{
                    c2 = 0;
                }
            }
            if(max1 > max2){
                System.out.println("Om");
            }
            else if(max1 < max2){
                System.out.println("Addy");
            }
            else{
                System.out.println("Draw");
            }
            
        }
    }
}
