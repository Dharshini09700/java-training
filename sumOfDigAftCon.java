import java.util.Scanner;
public class Main{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a' + 1;

            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
        }
        for(int i = 1; i < k; i++) {
            int temp = sum;
            sum = 0;
            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
        return sum;
    }
}
