import java.util.Scanner;

public class 대소문자변환 {

    // 강사님
    public static String Solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }



    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Solution(str));
    }
}