import java.util.Scanner;
public class countones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count =0;
        int max = 0;
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            if(value<=k){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count=0;
            }
        }
         System.out.println("Max: "+max);
    }
}
