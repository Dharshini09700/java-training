import java.util.Scanner;
public class AreaOfTriangle1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();

        int s = (a+b+c)/2;
        
        int area = s *(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(area));
        sc.close();
    }
}
