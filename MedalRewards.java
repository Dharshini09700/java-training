import java.util.*;
class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
		    int b = sc.nextInt();
		    if(b <= 3){
		        System.out.println("BRONZE");
		    }
		    else if(b > 3 && b <= 6){
		        System.out.println("SILVER");
		    }
		    else{
		        System.out.println("GOLD");
		    }
		}

	}
}
