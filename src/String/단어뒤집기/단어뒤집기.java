import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {

    // 내가 푼 풀이
    public static String Solution(String str) {
        String answer = "";

        int len = str.length();
        char[] chars = str.toCharArray();

        char[] temp = new char[len];
        int index = 0;
        for (int i = len - 1; i >= 0; i--) {
            temp[index] = chars[i];
            index++;
        }
        answer = String.valueOf(temp);

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.next();
        }
        for (String s : array) {
            System.out.println(Solution(s));
        }
    }

    // 강사님 풀이 1
    public static ArrayList<String> solution1(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : strings) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static ArrayList<String> solution2(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : strings) {
            char[] chars = x.toCharArray();

            // lt : 단어의 시작점, rt : 단어의 끝지점
            int lt = 0;
            int rt = x.length()-1;
            // 단어의 시작점은 점점 증가하고 단어의 끝지점은 점점 감소하면서 각 위치의 char 를 교환하고, 두 지점이 겹치거나 뒤바뀔 때 반복문 종료
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }

            String reverseWord = String.valueOf(chars);
            answer.add(reverseWord);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        for (String x : solution2(n, str)) {
            System.out.println(x);
        }
    }
/*
* String 연산이 많아질 경우, StringBuilder 를 사용한다.
* Why? 연산시 새로운 객체를 생성할 필요 없이, 하나의 StringBuilder 객체만으로도 가능하기 때문에 메모리 낭비가 없다.
*
* */

}