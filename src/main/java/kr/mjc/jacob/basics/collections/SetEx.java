package kr.mjc.jacob.basics.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Set 테스트
 */
public class SetEx {
  public static void main(String[] args) {
    Set<String> set1 = new HashSet<>();
    set1.add("Melon");
    set1.add("Apple");
    set1.add("Strawberry");
    set1.add("Apple"); // set에 중복 오브젝트는 안들어감

    System.out.println(set1);

    for (String s : set1) {
      System.out.println(s);
    }

    set1.forEach(System.out::println);
  }
}
