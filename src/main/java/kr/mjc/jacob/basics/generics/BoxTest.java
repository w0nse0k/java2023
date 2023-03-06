package kr.mjc.jacob.basics.generics;

/**
 * IntegerBox와 StringBox 테스트
 */
public class BoxTest {

  public static void main(String[] args) {
    BoxTest boxTest = new BoxTest();
    boxTest.useBox();
    boxTest.useTypedBox();
    boxTest.useGenericBox();
  }

  /**
   * Box 사용 예
   */
  public void useBox() {
    Box box1 = new Box();
    box1.set(5);
    int i = (Integer) box1.get();

    box1.set("abc");
    String s = (String) box1.get();

    // compile ok, run failure
    int x = (Integer) box1.get();
  }

  /**
   * StringBox와 IntegerBox 사용 예
   */
  public void useTypedBox() {
    StringBox stringBox = new StringBox();
    stringBox.set("abc");
    String s = stringBox.get();

    IntegerBox integerBox = new IntegerBox();
    integerBox.set(5);
    int i = integerBox.get();
  }

  /**
   * GenericBox 사용 예
   */
  public void useGenericBox() {
    GenericBox<Integer> integerBox =
        new GenericBox<>(); // Diamond: Type inference
    integerBox.set(5);
    int i = integerBox.get();

    GenericBox<String> stringBox = new GenericBox<>();
    stringBox.set("abc");
    String s = stringBox.get();

    // compile error
    // integerBox.set("abc");
    // stringBox.set(5);
  }
}
