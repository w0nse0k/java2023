package kr.mjc.jacob.basics.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Deque 테스트 (Queue + Stack)
 */
public class ArrayDequeEx {
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();
    deque.offerFirst("a");
    deque.offerFirst("b");
    deque.offerLast("c");
    deque.offerLast("d");

    System.out.println(deque);

    System.out.format("first = %s\n", deque.pollFirst());
    System.out.format("last = %s\n", deque.pollLast());

    System.out.println(deque);
  }
}
