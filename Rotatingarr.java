
import java.util.Scanner;
public class Rotatingarr {
    static void leftShift(int n, int arr[]){
        int temp = arr[0];
        for(int j = 0;j<n-1;j++){
            arr[j] = arr[j+1];
        }
        arr[n-1] = temp;
        for(int k = 0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    static void rightShift(int n, int arr[]){
        int temp = arr[n-1];
        for(int j = n-1;j>0;j--){
            arr[j] = arr[j-1];
        }
        arr[0] = temp;
        for(int k = 0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //leftShift(n, arr);
        rightShift(n, arr);
    }
}
