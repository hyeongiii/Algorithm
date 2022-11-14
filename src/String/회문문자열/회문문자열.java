import java.util.Scanner;

public class 회문문자열 {

    // 내가 푼 풀이
    public static String Solution(String str) {
        String word = str.toUpperCase();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (word.charAt(lt) != word.charAt(rt)) {
                return "NO";
            } else {
                lt++;
                rt--;
            }
        }

        return "YES";
    }

    // 강사님 풀이1
    public static String solution1(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return "NO";
            }
        }

        return answer;
    }

    // 강사님 풀이2
    public static String solution2(String str) {
        String answer = "YES";

        String tmp = new StringBuilder(str).reverse().toString();

        if (!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(Solution(str));
    }

}