import java.util.Scanner;
public class Main{
    public static void main (String[] args){
    	    Scanner sc = new Scanner(System.in);
    	    int a = sc.nextInt();
    	    for(int i = 0;i<a;i++){
    	        int b = sc.nextInt();
    	        int c = sc.nextInt();
    	        int x = c%100;
    	        if((c/100)+1 <= b){
    	            System.out.println(0);
    	        }
    	        else if(x == 0){
    	            int y = (c/100)-b;
    	            System.out.println(y);
    	        }
    	        else{
    	            int y = ((c/100)+1)-b;
    	            System.out.println(y);
    	        }
    	    }
    	}
}
