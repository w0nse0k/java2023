package kr.mjc.jacob.basics.generics;

/**
 * Pair 테스트
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">https://docs.oracle.com/javase/tutorial/java/generics/types.html</a>
 */
public class PairTest {
  public static void main(String[] args) {
    Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
    Pair<String, String> p2 = new OrderedPair<>("hello", "world");

    System.out.format("%s, %s\n", p1.getKey(), p1.getValue());
    System.out.format("%s, %s\n", p2.getKey(), p2.getValue());
  }
}
