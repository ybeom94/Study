package Day;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day23
{
    public static void main(String[] args)
    {
        // java.time
        // java.time.format => 날짜 시간 변경
        // MySQL => LocalDateTime / Oracle => Date
        // LocalDateTime : 날짜 + 시간
        // LocalDate : 날짜
        // LocalTime : 시간
        // => final

        // 1. 현재 날짜 + 시간
        // LocalDateTime now = LocalDateTime.now();
        // System.out.println(now);
        // // 2. 특정 날짜 시간 생성
        // LocalDateTime dateTime = LocalDateTime.of(2026, 11, 11, 14, 30, 30);
        // System.out.println(dateTime);
        // // 3. 날짜, 시간 더하기, 빼기
        // LocalDateTime f = now.plusDays(4).plusHours(3);
        // System.out.println(f);

        // // 값 추출
        // int year = now.getYear();
        // int month = now. getMonthValue();
        // int day = now.getDayOfMonth();

        // // 변경
        // DateTimeFormatter ff = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // LocalDateTime t = LocalDateTime.parse("2026-03-31 15:47:40", ff);
        // System.out.println(t);

        // 정규표현식 : 지정된 패턴을 가지고 문자열 검색, 검사하는 클래스
        // [] 한개의 문자 : [abc] => a|b|c
        // [A-Z] [a-z] => 범위 / [A-Za-z] 알파벳 전체 / [0-9] 숫자 전체 / [가-힣] 한글 전체
        // \d => \(\\) => \\d 숫자 / \s 공백 / \w 한개의 알파벳 / . 임의의 한글자 / ? 한개이거나 없음 / * 0개 이상 / + 한개 이상
        // {n} n개 => [A-Z]{3} / {n,m} 범위 => [0-9]{1,3} / 211.238.142.21 => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
        // | => a|b =>[ab] a이거나 b / ^ 시작 => ^[A-Z] / [^A-Z] 제외 / $ 끝 => [A-Z]$
        // ((211.238.142).21) 전체 group() / split("\\|"), replaceAll("[^가-힣]", "")

        // String res = "맛있는, 맛있고, 맛있게, 맛있소, 맛있다, 맛없다, 맛있습니다";
        // // 맛있* 맛있+ 맛있.
        // //Pattern pattern = Pattern.compile("맛있.");
        // //Pattern pattern = Pattern.compile("맛있+");
        // Pattern pattern = Pattern.compile("맛있[가-힣]+");
        // Matcher matcher = pattern.matcher(res);
        // while (matcher.find())
        // {
        //     System.out.println(matcher.group());
        // }

        // System.out.println("===== 데이터 추출 =====");
        // String price = "가격 : 30,000원";
        // String str = price.replaceAll("[^0-9]", "");
        // System.out.println(str);

        // String res = "홍길동|남자|30|서울|010-1111-1111";
        // String[] infos = res.split("\\|");
        // for (String s : infos)
        // {
        //     System.out.println(s);
        // }
        // 특수기호를 이용해서 복잡한 문자를 찾는 방법
        // 문자형식 => 패턴 => Matcher
        // p.matcher(res) => res는 대상, 패턴안에 포함 여부
        // m.find() => 패턴에 맞는 데이터 찾는다
        // m.group() => 실제 찾은 문자열을 가지고 온다

        // System.out.println("hkkllo".matches("h..llo"));
        // System.out.println("Heello".matches("H[A-Za-z]*llo"));
        // System.out.println("sfnjg;jwsdlfno".matches("s.*o"));
        // System.out.println("dal'd'lfijldkflg".matches("."));

        // System.out.println("color".matches("colou?r"));
        // System.out.println("".matches("c?a?t?"));

        // [abc] => a|b|c / [(abc)] => abc
        // [가-힣]{5} => 한글이 5글자
        // [가-힣]{3,5} => 3,4,5
        System.out.println("123123".matches("(\\d+)+"));
        System.out.println("a1b2c3".matches("(\\w\\d)+"));
        System.out.println(" ".matches("\\s"));
        System.out.println("1 2".matches("\\d\\s\\d"));
        System.out.println("1+2".matches("\\d\\+\\d"));
        System.out.println("a\\b".matches("\\w\\\\\\w"));
        System.out.println("c++".matches("\\w\\+\\+"));
        System.out.println("^abc$".matches("\\^(abc)\\$"));
    }
}
