[String]
    # public char[] toCharArray()
      : string 을 char[] 로 변환시키는 메서드

    # public String[] split(String regex)
      : regex 로 받은 문자열/문자를 기준으로 String 값을 끊어 배열로 저장하는 메서드
      ex) String str = "This is big pencil";
          str.split(" ") -> This/is/big/pencil

    # public int indexOf(int ch)
      : 매개변수로 받은 char 가 문자열에서 처음 등장하는 index 의 값을 반환하며, 없을 경우 -1 반환
      ex) String str = "Have a nice day";
          str.indexOf(' ') -> 4

    # public String substring(int beginIndex, int endIndex)
      : beginIndex 부터 endIndex 직전까지(endIndex 미포함) 자른 문자열을 반환
      ex) "hamburger".substring(4,7) returns "urg"

    # public static String valueOf(char[] data)
      : character 배열을 String 으로 바꿔준다.

    # public int indexOf(int ch)
      : 문자열 내에서 매개변수로 받은 char 가 처음으로 등장하는 위치의 index 를 반환하는 메서드
      ex) "stress".indexOf(s) -> 0

    # public boolean equalsIgnoreCase(String anotherString)
      : 대소문자를 고려하지 않고 매개변수로 받은 다른 문자열과 같은지 아닌지를 비교하는 메서드

    # public String replaceAll(String regex(정규식), String replacement)
      : 지정된 정규식과 일치하는 문자열을 지정된 항목으로 대체한다.

[Character]
    # public static boolean isUpperCase(char ch)
      : 매개변수로 받은 문자가 대문자인지 판별하는 메서드

    #public static boolean isAlphabetic(int codePoint)
      : 매개변수로 받은 특정 Char 이 알파벳인지 아닌지 판별해주는 메서드
      ex) Character.isAlphabetic(c) -> true
    
    # public static char toUpperCase(char ch)  
    # public static char toLowerCase(char ch)  
      : 매개변수로 받은 소문자(대문자)를 대문자(소문자)로 변환
    
    # public static boolean isDigit(char ch)
      public static boolean isDigit(int codePoint)
      : 매개변수로 받은 char/int 가 숫자인지 판별하는 메서드 

[Integer]
    # public static int parseInt(String s)
      : 문자열을 숫자로 바꿔주는 메서드

[StringBuilder] java.lang  
    # public StringBuilder reverse()
      : character 의 순서를 뒤바꾼 다음 StringBuilder 타입으로 반환한다.