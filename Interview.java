public class Interview {
    public static void main(String args[]){
        String str = "1";
        System.out.println(str.matches("[0-1]"));

        String str1 = "8";
        System.out.println(str1.matches("[0-9A-Fa-f]"));

        String str2 = "  Java  ";
        String str3 = str2.trim();
        System.out.println(str3);

        String str4 = "e24ai045@gmail.com";
        boolean b = str4.endsWith("com");
        System.out.println(b);

        String str5 = str4.substring(0, 8);
        String str6 = str4.substring(8, 18);
        System.out.println(str5);
        System.out.println(str6);

        String str7 = "Hello@123#World";
        String str8 = str7.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str8);
    }
}
