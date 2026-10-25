import java.util.Scanner;
public class Main{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      while(a-- > 0){
      		int b = sc.nextInt();
      		String s1 = sc.next();
      		String s2 = sc.next();
      		int c1 = 0;
      		int c2 = 0;
          for(int i=0;i<b;i++){
          	 if(s1.charAt(i) == '1'){
          		    c1++;
          		}
          		if(s2.charAt(i) == '1'){
          		    c2++;
          		}
         }
         if(c1 == c2){
          	System.out.println("YES");
         }
         else{
          	System.out.println("NO");
         }
     }
  }
}
