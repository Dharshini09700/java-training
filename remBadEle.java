import java.util.Scanner;
public class Main{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    		int a = sc.nextInt();
    		while(a-- > 0){
    		    int b = sc.nextInt();
    		    int arr[] = new int[b];
    		    for(int i=0;i<b;i++){
    		        arr[i] = sc.nextInt();
    		    }
    		    int max = 0;
    		    for(int i=0;i<b;i++){
    		        int ct = 0;
    		        for(int j=0;j<b;j++){
    		            if(arr[i] == arr[j]){
    		                ct += 1;
    		            }
    		        }
    		        if(max < ct){
    		            max = ct;
    		        }
    		    }
    		    if(max <= 1){
    		        System.out.println(b-1);
    		    }
    		    else{
    		        System.out.println(b-max);
    		    }
    		}
     }
	}
}
