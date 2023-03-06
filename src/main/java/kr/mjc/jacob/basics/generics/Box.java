package kr.mjc.jacob.basics.generics;

/**
 * A Simple Box Class
 *
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">https://docs.oracle.com/javase/tutorial/java/generics/types.html</a>
 */
public class Box {
  private Object object;

  public void set(Object object) {
    this.object = object;
  }

  public Object get() {
    return object;
  }
}
