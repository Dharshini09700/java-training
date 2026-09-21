import java.util.Scanner;
public class Drone{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n1 = a/b;
        long n2 = a%b;
        if(n1>=1){
            System.out.println("Complete pack: "+n1);
            System.out.println("Spare cells: "+n2);
            System.out.println("READY");
        }
        else{
            System.out.println("Complete pack: "+n1);
            System.out.println("Spare cells: "+n2);
            System.out.println("WAIT");
            sc.close();
        }
    }
}