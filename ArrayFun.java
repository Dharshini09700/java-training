public class ArrayFun {
    static String arrayFun(int a){
        if(a%2 == 0){
            return "yes";
        }
        else{
            return "no";
        }
    }
    static void printval(int b){
        for(int j=0;j<=b;j++){
            print(j);
        }
    }
    static void print(int a){
        System.out.print(a+" ");
    }
    public static void main(String args[]){
        int[] arr = {64,8,19,54};
        for(int i=0;i<4;i++){
            System.out.println(arrayFun(arr[i]));
            printval(arr[i]);
        }
        
    }
}
