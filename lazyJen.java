import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();

            long totalTime = 0;

            while (n > 0) {
                long solved = (n + 1) / 2; // works for both even and odd n
                totalTime += solved * m;
                n -= solved;

                if (n > 0) {
                    totalTime += b; // take a break only if problems remain
                    m *= 2;         // solving time per problem doubles
                }
            }

            System.out.println(totalTime);
        }
    }
}
