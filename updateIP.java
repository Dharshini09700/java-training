import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        String b = "";
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                b += "[.]";
            } 
            else {
                b += ch;
            }
        }
        System.out.println(b);
    }
}
