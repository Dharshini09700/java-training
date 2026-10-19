import java.util.Scannee;
public class Main{
     public static void main(String args[]){
          int n = sc.nextInt();
          int nums[] = new int[n];
          int a[] = new int[nums.length];
          for(int i=0;i<nums.length;i++){
              a[i] = nums[nums[i]];
          }
          return a;
    }
}
