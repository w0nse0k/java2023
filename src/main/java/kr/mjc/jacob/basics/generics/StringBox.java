package kr.mjc.jacob.basics.generics;

/**
 * 문자열 한개를 담는 상자
 */
public class StringBox {
  private String s;

  public void set(String s) {
    this.s = s;
  }

  public String get() {
    return s;
  }
}
