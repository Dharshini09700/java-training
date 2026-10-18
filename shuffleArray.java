import java.util.Scanner;
public clas Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[];
        int[] a = new int[2 * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            a[k] = nums[i];
            k++;

            a[k] = nums[i + n];
            k++;
        }
        return a;
    }
}
