import java.util.Scanner;
public class Main{
   public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        if (r == 2) {
            System.out.println(8 - r - 1);
        } else {
            System.out.println(8 - r);
        }
    }
}
