import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
  		int a = sc.nextInt();
  		while(a-- > 0){
  		    int b = sc.nextInt();
  		    String s = sc.next();
  		    int c1 = 0;
  		    int c2 = 0;
  		    int c3 = 0;
  		    for(int i=0;i<b;i++){
  		        char ch = s.charAt(i);
  		        if(ch == 'I'){
  		            c1++;
  		        }
  		        else if(ch == 'Y'){
  		            c2++;
  		        }
  		        else{
  		            c3++;
  		        }
  		    }
  		    if(c1 > 0){
  		        System.out.println("INDIAN");
  		    }
  		    else if(c2 > 0){
  		        System.out.println("NOT INDIAN");
  		    }
  		    else{
  		        System.out.println("NOT SURE");
  		    }
  		}
   }
}
