
public class Patternj {
    static void PatternJ(int n){
        for(int i=1;i<=n*2-1;i++){
            for(int j=1;j<=n-Math.abs(n-i);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        int n = 5;
        PatternJ(n);

    }   
}
