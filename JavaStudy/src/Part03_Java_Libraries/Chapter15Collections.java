package Part03_Java_Libraries;

/*
    Chapter 15. 컬렉션 자료구조
 
    15.1 컬렉션 프레임워크
    - 컬렉션은 여러 객체를 저장·관리하기 위한 인터페이스와 구현 클래스를 제공한다.
    - List, Set, Map은 자료 저장 규칙이 다르다.
 
    15.2 List 컬렉션
    - List는 순서를 유지하고 중복을 허용한다.
    - ArrayList는 배열 기반으로 인덱스 접근이 빠르고 LinkedList는 연결 구조를 사용한다.
 
    15.3 Set 컬렉션
    - Set은 중복 원소를 허용하지 않는다.
    - HashSet의 중복 판단에는 equals와 hashCode 계약이 중요하다.
 
    15.4 Map 컬렉션
    - Map은 키와 값을 짝으로 저장하고 키의 중복을 허용하지 않는다.
    - HashMap의 순서는 보장되지 않으며 LinkedHashMap은 삽입 순서를 유지한다.
 
    15.5 검색 기능을 강화시킨 컬렉션
    - TreeSet·TreeMap은 정렬된 탐색을 제공한다.
    - 비교 기준은 Comparable 또는 Comparator로 결정한다.
 
    15.6 LIFO와 FIFO 컬렉션
    - 스택은 나중에 들어온 항목을 먼저 꺼내고(LIFO), 큐는 먼저 들어온 항목을 먼저 꺼낸다(FIFO).
    - Deque는 양쪽 끝의 삽입·삭제를 지원한다.
 
    15.7 동기화된 컬렉션
    - Collections.synchronizedList 등으로 컬렉션에 대한 동기화 래퍼를 만들 수 있다.
    - 여러 단계의 복합 작업·반복에는 추가 동기화가 필요할 수 있다.
 
    15.8 수정할 수 없는 컬렉션
    - List.of, Set.of, Map.of로 수정할 수 없는 컬렉션을 생성할 수 있다.
    - Collections.unmodifiableList는 원본을 참조하는 읽기 전용 뷰이므로 원본 변경의 영향을 받을 수 있다.
 */

public class Chapter15Collections {
    public static void main(String[] args) throws Exception {
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("A"); list.add("A");
        java.util.Set<String> set = new java.util.HashSet<>(list);
        java.util.Map<String, Integer> map = java.util.Map.of("A", 1);
        System.out.println(list + " / " + set + " / " + map);
    }
}
