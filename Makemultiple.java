import java.util.Scanner;
public class Makemultiple{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while (t-->0){
		    int n=s.nextInt();
		    if (n%3==0){
		        System.out.println(0);
		    }
		   else if ((n+1)%3==0){
		        System.out.println(1);
		    }
		    else{
		        int nxtmul=((n/5)+1)*5;
		        if(nxtmul%3==0){
		            System.out.println(1);
		        }
                else{
		            System.out.println(2);
		        }
		    }
		}
	}
}