import java.util.Scanner;
public class Main{
  public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long rows = (n + 1) / 2;
            long seats = (m + 1) / 2;
            long result = rows * seats;
            System.out.println(result);
        }
    }
}
