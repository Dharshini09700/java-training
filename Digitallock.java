import java.util.Scanner;
public class Digitallock {
    static void lock(long n){
        long count = 0;
        long a = 1;
        long n1 = 0;
        while(a>0){
            long b = 1;
            a = n%10;
            n1 = b*a;
        }
        n = n1;
        count +=1;
        
        System.out.println(n);
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        lock(n); 
        sc.close();
    }
}
