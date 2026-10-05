import java.util.Scanner;
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         if(a <= 0){
             return false;
          }
          while(a%4 == 0){
              a = a/4;
          }
          return n == 1;
    }
}
