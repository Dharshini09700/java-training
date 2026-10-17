import java.util.Scanner;
public class Main{
     public static void main(String args[]){
        String sentence = sc.nextLine();
        boolean[] a = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            a[sentence.charAt(i) - 'a'] = true;
        }
        for(int i=0;i<26;i++){
            if(!a[i]){
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
