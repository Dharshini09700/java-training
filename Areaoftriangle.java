import java.util.Scanner;
public class Areaoftriangle{
    public static void main(){
        int b,h;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        System.out.println((b*h)/2);
        sc.close();
    }
}