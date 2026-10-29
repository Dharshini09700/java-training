import java.util.Scanner;
public class Main{
   public Static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  		int a = sc.nextInt();
  		for(int i=0;i<a;i++){
  		    int b = sc.nextInt();
  		    int c = sc.nextInt();
  		    int x = b - c;
  		    if(x<=c){
  		        System.out.println(x);
  		    }
  		    else{
  		        System.out.println(c);
  		    }
  		}
   }
}
