import java.util.Scanner;

public class 특정문자뒤집기 {

    // 내가 푼 풀이
    public static String Solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;

                lt++;
                rt--;
            }
        }

        answer = String.valueOf(chars);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(Solution(str));
    }
}