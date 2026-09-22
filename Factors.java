
import java.util.Scanner;
public class Factors {
    static int factor(int n){
        int sum = 0;
        int i = 1;
        for(i = 1;i<n;i++){
            if(n%i == 0){
                sum +=i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factor(n));
        sc.close();
    }
    
}
