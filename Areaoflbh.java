import java.util.Scanner;
public class Areaoflbh{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area:"+2*(l*b+b*h+h*l));
        System.out.println("Volume:"+l*b*h);
        System.out.println("Height:"+4*(l+h+b));
        sc.close();
    }
}
