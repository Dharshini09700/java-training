import java.util.Scanner;
public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        long fee;
        if (hours <= 2) fee = hours * 30L;
        else if (hours <= 5) fee = 60L + (hours - 2L) * 20L;
        else fee = 120L + (hours - 5L) * 10L;
        if (hours > 8) fee += 50;
        System.out.println("Fee: ₹" + fee);
        sc.close();
    }
}
    

