import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  		int a = sc.nextInt();
  		for(int i=0;i<a;i++){
  		    int b = sc.nextInt();
  		    int c = sc.nextInt();
  		    int d = sc.nextInt();
  		    if(b>=c){
  		        System.out.println("PIZZA");
  		    }
  		    else if(b>=d){
  		        System.out.println("BURGER");
  		    }
  		    else{
  		        System.out.println("NOTHING");
  		    }
  		}
   }
}
