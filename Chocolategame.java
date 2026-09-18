import java.util.Scanner;
public class Chocolategame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            int sum = 0;
            int b = sc.nextInt();
            for(int j = 0;j<b;j++){
                int c = sc.nextInt();
                sum += c;
            }
            if(sum % 2 == 0){
                System.out.println(sum-1);
            }
            else{
                System.out.println("0");
            }
        }
    }
}