import java.util.Scanner;
public class Main{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     while(n-- > 0){
      	long a = sc.nextInt();
      	long odd = (a+1)/2;
      	long eve = a/2;
      	long res = 2*odd*eve;
      	System.out.println(res);
     }
   }
}
