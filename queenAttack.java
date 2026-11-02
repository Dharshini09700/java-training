import java.util.Scanner;
public class Main{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    		int a = sc.nextInt();
    		while(a-- > 0){
    		    long n = sc.nextLong();
    		    long b = sc.nextLong();
    		    long c = sc.nextLong();
    		    long horver = (b-1)+(n-b)+(c-1)+(n-c);
    		    long tl = Math.min(b-1, c-1);
    		    long tr = Math.min(b-1, n-c);
    		    long bl = Math.min(n-b, c-1);
    		    long br = Math.min(n-b, n-c);
    		    long tot = horver + tl + tr + br + bl;
    		    System.out.println(tot);
    		    
    		}
	  }
}
