package kr.mjc.jacob.basics.generics;

/**
 * Multiple type parameters
 *
 * @param <K> Key
 * @param <V> Value
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">https://docs.oracle.com/javase/tutorial/java/generics/types.html</a>
 */
public interface Pair<K, V> {
  K getKey();

  V getValue();
}
