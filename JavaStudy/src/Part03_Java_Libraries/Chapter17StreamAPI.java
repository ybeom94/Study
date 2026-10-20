package Part03_Java_Libraries;

/*
    Chapter 17. 스트림 요소 처리
 
    17.1 스트림이란?
    - Stream은 컬렉션·배열 등의 요소를 읽어 선언적으로 가공하는 처리 수단이다.
    - 스트림은 저장소가 아니며 최종 연산 뒤에는 같은 스트림을 재사용할 수 없다.
 
    17.2 내부 반복자
    - 외부 반복은 for문으로 직접 이동하며 내부 반복은 스트림이 처리 흐름을 제어한다.
    - 필요한 연산을 연결하여 데이터를 다룰 수 있다.
 
    17.3 중간 처리와 최종 처리
    - filter, map, sorted 같은 중간 연산은 새 스트림을 만들고 일반적으로 지연 실행된다.
    - forEach, collect, count 같은 최종 연산이 파이프라인을 평가한다.
 
    17.4 리소스로부터 스트림 얻기
    - Collection.stream, Arrays.stream, Stream.of, IntStream.range 등이 스트림을 생성한다.
    - Files.lines처럼 자원을 사용하는 스트림은 닫아야 할 수 있다.
 
    17.5 요소 걸러내기(필터링)
    - filter는 Predicate를 만족하는 요소를 남기며 distinct는 중복 요소를 제거한다.
    - limit과 skip으로 처리 범위를 제한할 수도 있다.
 
    17.6 요소 변환(매핑)
    - map은 요소를 다른 값으로 변환하고 flatMap은 중첩된 흐름을 하나로 평탄화한다.
    - 숫자 전용 IntStream/DoubleStream 등으로 집계에 필요한 연산을 사용할 수 있다.
 
    17.7 요소 정렬
    - sorted는 자연 순서 또는 Comparator를 사용한다.
    - 비교 기준이 없다면 원소 타입이 Comparable을 구현해야 할 수 있다.
 
    17.8 요소를 하나씩 처리(루핑)
    - forEach는 소비 동작을 수행하는 최종 연산이고 peek는 중간 연산이다.
    - peek를 데이터 변경이나 필수 부작용에 의존하는 용도로 쓰지 않는 편이 좋다.
 
    17.9 요소 조건 만족 여부(매칭)
    - allMatch, anyMatch, noneMatch는 조건 만족 여부를 boolean으로 반환한다.
    - 단축 평가로 모든 원소를 확인하지 않고 끝날 수 있다.
 
    17.10 요소 기본 집계
    - count, min, max, sum, average 등으로 개수와 통계를 계산한다.
    - 값이 없을 수 있는 집계는 Optional/OptionalDouble 등을 사용할 수 있다.
 
    17.11 요소 커스텀 집계
    - reduce로 여러 요소를 하나의 값으로 축약할 수 있다.
    - 병렬 처리에서는 결합 법칙과 부작용 없는 연산이 특히 중요하다.
 
    17.12 요소 수집
    - collect로 List/Set/Map 또는 groupingBy 등의 결과를 생성한다.
    - Stream.toList()로 생성한 목록은 구조적 수정이 불가능하다.
 
    17.13 요소 병렬 처리
    - parallelStream은 분할 처리로 성능 향상을 시도한다.
    - 작업 비용·자료 크기·공유 상태에 따라 오히려 느리거나 잘못된 결과를 만들 수 있다.
 */

public class Chapter17StreamAPI {
    public static void main(String[] args) throws Exception {
        java.util.List<String> names = java.util.List.of("Java", "API", "Stream");
        java.util.List<String> result = names.stream()
                .filter(s -> s.length() >= 4) // 중간 연산
                .map(String::toUpperCase)    // 중간 연산
                .toList();                  // 최종 연산
        System.out.println(result);
    }
}
