public class Lowtri{
    static void patternLow(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void patternUp(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
     public static void main(String args[]){
        int n = 5;
        //patternLow(n);
        patternUp(n);
     }
}
