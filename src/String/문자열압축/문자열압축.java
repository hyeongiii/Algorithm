import java.util.Scanner;

public class  {

    // 내가 작성한 답
    public static String Solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        char temp = chars[0];
        int num = 0;

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == temp) {
                num++;
                if(num == 1) {
                    answer += chars[i];
                }
                if(i == chars.length-1 && num != 1) {
                    answer += Integer.toString(num);
                }
            } else if(chars[i] != temp) {
                if(num != 1) {
                    answer += Integer.toString(num);
                }
                temp = chars[i];
                num = 1;
                answer += chars[i];
            }
        }

        return answer;
    }

    // 강사님 풀이
    public static String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;

        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) cnt ++;
            else{
                answer+=s.charAt(i);
                if(cnt>1)answer+=String.valueOf(cnt);
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Solution(str));
    }

}