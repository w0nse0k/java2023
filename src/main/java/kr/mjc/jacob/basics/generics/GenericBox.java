package kr.mjc.jacob.basics.generics;

/**
 * Box 클래스의 제네릭 버전
 *
 * @param <T> 박스에 들어갈 값의 타입
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">https://docs.oracle.com/javase/tutorial/java/generics/types.html</a>
 */
public class GenericBox<T> {
  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
}
