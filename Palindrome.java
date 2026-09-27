public class Palindrome{
    static String palindrome(int a){
        int rev = 0;
        int n = a;
        int rem;
        while(a > 0){
            rem = a % 10;
            rev = (rev*10)+rem;
            a = a / 10;
        }
        System.out.println(n);      
        if(n == rev){
            return "yes";
        }
        else{
            return "no";
        }
    }
    public static void main(String args[]){
        System.out.println(palindrome(1221));
    }
}