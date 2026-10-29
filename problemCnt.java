import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    while(a-- > 0){
	        int b = sc.nextInt();
	        int c1 = 0;
	        for(int i=1;i<=b;i++){
	            int c = sc.nextInt();
	            if(c%2 != 0){
	                c1++;
	            }
	        }
	        if(c1 > 0 && c1%2 == 0){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
   }
}
