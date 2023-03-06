package kr.mjc.jacob.basics.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * p.418 예제 7-7. HashMapStudentEx 수정
 */
public class MapEx {
  public static void main(String[] args) {
    Student s1 = new Student(1, "황기태");
    Student s2 = new Student(2, "이재문");
    Student s3 = new Student(3, "김남윤");

    Map<Integer, Student> map1 = new HashMap<>();
    map1.put(1, s1);
    map1.put(2, s2);
    map1.put(3, s3);

    System.out.println(map1);
    System.out.println(map1.get(2));
    System.out.println(map1.get(3));

    // 맵은 엔트리 셋
    for (Map.Entry<Integer, Student> entry : map1.entrySet()) {
      System.out.format("key:%d, value:%s\n", entry.getKey(), entry.getValue());
    }

    // 키셋에서 키로 값 가져오기
    for (int key : map1.keySet()) {
      Student value = map1.get(key);
      System.out.println(value);
    }

    // using BiConsumer lamda
    map1.forEach((k, v) -> System.out.format("%d : %s\n", k, v));
  }
}
