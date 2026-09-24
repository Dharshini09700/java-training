import java.util.Scanner;
public class Insdel {
    static void deletion(int a, int arr[],int b, int arr1[]){
        for(int j = 0;j<a;j++){
            if(arr[j] == b){
                for(int k = j;k<a-1;k++){
                    arr[k] = arr[k+1];
                }
                break;
            }
        }
        for(int i = 0;i<(a-1);i++){
            arr1[i] = arr[i];
            //System.out.print(arr1[i]+" ");
        }
        for(int j = 0;j<a-1;j++){
            arr[j] = arr1[j];
            System.out.print(arr[j]+" ");
        }
    }
    static void insertion(int a,int arr[],int b,int ind){
        for(int i = 0;i<a;i++){
            if(ind == i){
                for(int j =(a-1)-1;j>=ind;j--){
                    arr[j+1] = arr[j];
                }
                break;
            }
        }
        arr[ind] = b;
        for(int i = 0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("size: ");
        int a = sc.nextInt();
        System.out.println("array: ");
        int []arr = new int[a];
        //int []arr1 = new int[a-1];
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("value: ");
        int b = sc.nextInt();
        System.out.println("index: ");
        int ind = sc.nextInt();
        //deletion(a, arr, b, arr1);
        insertion(a,arr,b,ind);

    } 
}
