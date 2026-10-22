import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        System.out.println(rev);
    }
}
