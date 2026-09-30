import java.util.Scanner;
public class Main{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int jewels = sc.nextInt();
          int stones = sc.nextInt();
          int c = 0;
          for(int i=0;i<jewels.length();i++){
              for(int j=0;j<stones.length();j++){
                  char ch = jewels.charAt(i);
                  char ch1 = stones.charAt(j);
                  if(ch == ch1){
                      c += 1;
                  }
              }
          }
          return c;
    }
}
