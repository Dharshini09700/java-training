import java.util.Scanner;
public class Salarycalculation {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int hour = sc.nextInt();
        long salary = sc.nextLong();
        float totsal = hour*salary;
        System.out.println("id:"+id);
        System.out.printf("%.2f",totsal);

        sc.close();
    }
}
