import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      		int a = sc.nextInt();
      		while(a-- > 0){
      		    long b = sc.nextLong();
      		    long c = sc.nextLong();
      		    long d = sc.nextLong();
      		    if(b == c){
      		        System.out.println("YES");
      		    }
      		    else if(Math.abs(b-c) % (2*d) == 0){
      		        System.out.println("YES");
      		    }
      		    else{
      		        System.out.println("NO");
      		    }
      		}
     }
}
