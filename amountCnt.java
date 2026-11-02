import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  		int a = sc.nextInt();
  		while(a-- > 0){
  		    int b = sc.nextInt();
  		    int c = sc.nextInt();
  		    int d = sc.nextInt();
  		    if((b+c) == d || (b+d) == c || (c+d) == b){
  		        System.out.println("yes");
  		    }
  		    else{
  		        System.out.println("no");
  		    }
  		}
	 }
}
