package kr.mjc.jacob.basics.generics;

/**
 * 정수 한개를 담는 상자
 */
public class IntegerBox {
  private int i;

  public void set(int i) {
    this.i = i;
  }

  public int get() {
    return i;
  }
}
