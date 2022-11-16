import java.util.Scanner;

public class 숫자만추출 {

    // 내가 푼 풀이
    public static int Solution(String str) {
        int answer;
        String temp = "";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isAlphabetic(chars[i])) {
                temp += chars[i];
            }
        }

        answer = Integer.parseInt(temp);

        return answer;
    }

    // 강사님 풀이1
    public static int solution1(String str) {
        int answer = 0;

        for (char x : str.toCharArray()) {
            if ((x>= 48 && x<57)) {
                // EX) 만약 숫자로 구성된 문자열이 0125일 경우,
                // 0*10 + 0 / 0*10 + 1 / 1*10 + 2 / 12*10 + 5 -> 125 가 된다.
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }

    // 강사님 풀이2
    public static int solution2(String string) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(Solution(str));
    }

}