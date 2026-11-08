import java.util.*;
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int k = sc.nextInt();
            long targetLength = a[k - 1];
            Arrays.sort(a);
            int newPosition = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == targetLength) {
                    newPosition = i + 1; // Convert back to 1-indexing
                    break;
                }
            }
            System.out.println(newPosition);
        }
    }
}
