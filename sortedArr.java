import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    		int a = sc.nextInt();
    		while(a-- > 0){
    		    int b = sc.nextInt();
    		    int c[] = new int[b]; 
    		    int ct = 0;
    		    for(int i=0;i<b;i++){
    		        c[i] = sc.nextInt();
    		    }
    		   int violationIndex = -1;
                int count = 0;
                for (int i = 0; i < b - 1; i++) {
                    if (c[i] > c[i + 1]) {
                        count++;
                        violationIndex = i;
                    }
                }
                if (count == 0) {
                    System.out.println("YES");
                } else if (count == 1) {
                    int temp = c[violationIndex];
                    c[violationIndex] = c[violationIndex + 1];
                    c[violationIndex + 1] = temp;
                    boolean sorted = true;
                    for (int i = 0; i < b - 1; i++) {
                        if (c[i] > c[i + 1]) {
                            sorted = false;
                            break;
                        }
                    }
                    if (sorted) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
	   }
}
