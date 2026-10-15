public class patterns {
    static void patternA(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void patternB(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" "+i);
            }
            System.out.println(" ");
        }
    }
    static void patternC(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void patternD(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println(" ");
        }
    }
    static void patternE(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void patternF(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+i);
            }
            System.out.println(" ");
        }
    }
    static void patternG(int n){
        for(int i=1;i<=n;i++){
            int var = i%2;
            for(int j=1;j<=i;j++){
                var = 1-var;
                System.out.print(" "+var);
            }
            System.out.println(" ");
        }
    }
    static void patternH(int n){
        for(int i=1;i<=n;i++){
            int var = 0;
            for(int j=1;j<=i;j++){
                var++;
                System.out.print(" "+var);
            }
            System.out.println(" ");
        }
    }
    static void patternI(int n){
        for(int i=1;i<=n;i++){
            int var = i%2;
            for(int j=1;j<=n-i+1;j++){
                var = 1-var;
                System.out.print(" "+var);
            }
            System.out.println(" ");
        }
    }
    static void patternJ(int n){
        for(int i=1;i<=n;i++){
            int var = 0;
            for(int j=1;j<=n-i+1;j++){
                var++;
                System.out.print(" "+var);
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
    int[] arr={3,5};
    for(int i = 0;i<2;i++){
        System.out.println("cases: "+i);
        //patternA(arr[i]);
        //patternB(arr[i]);
        //patternC(arr[i]);
        //patternD(arr[i]);
        //patternE(arr[i]);
        //patternF(arr[i]);
        //patternG(arr[i]);
        //patternH(arr[i]);
        //patternI(arr[i]);
        //patternJ(arr[i]);
    }
}
}

