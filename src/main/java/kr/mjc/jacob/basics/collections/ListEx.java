package kr.mjc.jacob.basics.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * p.401 예제 7-1 수정. List 테스트<br>
 * Vector는 동기화 되어 있다(thread-safe).
 * 동기화가 필요없는 목록에는 ArrayList를 사용한다.
 */
public class ListEx {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(4);
    list.add(-1);

    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      int item = list.get(i);
      System.out.println(item);
    }

    // enhanced for
    for (int item : list) {
      System.out.println(item);
    }

    // using Consumer lamda
    list.forEach(item -> System.out.println(item));

    // using method reference
    list.forEach(System.out::println);
  }
}
