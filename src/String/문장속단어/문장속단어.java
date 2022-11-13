import java.util.Scanner;

public class 문장속단어 {

    // 내가 푼 풀이
    public static String Solution(String str) {
        String answer = "";
        String[] array = str.split(" ");
        for (String word : array) {
            if (word.length() > answer.length()) {
                answer = word;
            }
        }

        return answer;
    }

    // 강사님 풀이 1
    public static String solution1(String str) {
        String answer = "";
        // 가장 긴 단어의 문자열 수
        int m = Integer.MIN_VALUE;

        String[] array =str.split(" ");
        for (String word : array) {
            int length = word.length();

            // 최댓값을 구하는 알고리즘
            if (length > m) {
                m = length;
                answer = word;
            }
        }
        return answer;
    }

    // 강사님 풀이 2
    public static String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        int pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String word = str.substring(0, pos);
            int length = word.length();
            if (length > m) {
                m = length;
                answer = word;
            }
            // 단어 한 개 잘라내기
            str = str.substring(pos + 1);
        }

        // 가장 마지막 단어 고려하기
        if (str.length() > m) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Solution(str));
    }
}