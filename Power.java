import java.util.Scanner;
public class Power{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int power;
        int i = 1;
        int j = 0;
        while(i<=a){
            power = i*i;
            if(power == a){
                System.out.println("Power: "+a);
                System.out.println("Unused: "+j);
            }
            else if(power > a){
                int k = a - power;
                System.out.println("Power: "+power);
                System.out.println("unused: "+k);
                break;
            }
        }
        sc.close();
    }
}