import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            long D = sc.nextLong();
            long A[] = new long[N];
            long sumA = 0, sumB = 0, sumMin = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
                sumA += A[i];
            }
            for (int i = 0; i < N; i++) {
                long b = sc.nextLong();

                sumB += b;
                sumMin += Math.min(A[i], b);
            }
            long cost1 = D + sumA;
            long cost2 = D + sumB;
            long cost3 = 2 * D + sumMin;

            System.out.println(Math.min(cost1,
                Math.min(cost2, cost3)));
        }
    }
}
