import java.util.Scanner;

public class 가장짧은문자거리 {

    // 힌트 받아 풀었음
    public static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        // c로부터 해당 문자간의 거리 (최대치로 설정 : 문자열의 길이가 100이기 때문에 100 이상의 숫자로 설정하면 된다.)
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (c == str.charAt(i)) {
                p = 0;
            } else {
                p++;
                // 내코드
                if (p < answer[i]){
                    answer[i] = p;
                }
                // 강사님 코드
                // answer[i] = Math.min(answer[i], p);

            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
    }

}