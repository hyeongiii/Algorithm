import java.util.Scanner;

public class 유효한팰린드롬 {

    // 내가 푼 풀이
    public static String Solution(String str) {
        char[] chars = str.toCharArray();
        String temp = "";

        for (int i = 0; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i])) {
                temp += chars[i];
            }
        }

        String reverse = new StringBuilder(temp).reverse().toString();
        if (temp.equalsIgnoreCase(reverse)) {
            return "YES";
        }

        return "NO";
    }

    // 강사님 풀이1
    public static String solution1(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(s).reverse().toString();

        if (s.equals(tmp)) answer = "YES";


        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Solution(str));
    }

}