package String.문자찾기;

import java.util.Scanner;

public class 문자찾기 {
    public static int solution(String word, String character) {
        int result = 0;

        String lower = word.toLowerCase();
        char c = character.toLowerCase().charAt(0);

        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == c) {
                result++;
            }
        }

        return result;
    }

    // 강사님 풀이
    public static int solution02(String word, char ch) {
        int result = 0;

        word = word.toLowerCase();
        ch = Character.toLowerCase(ch);

        for (char x : word.toCharArray()) {
            if (x == ch) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String character = in.next();

        // 강사님의 char 입력 방법
        char ch = in.next().charAt(0);

        System.out.println(solution(word, character));
    }
}