package kr.mjc.jacob.basics.lambdaexp;

import java.util.function.Consumer;

/**
 * 실행기
 *
 * @author Jacob
 */
public class Machine {

  /**
   * 인자가 없는 메서드를 두번 실행한다.
   */
  public void doTwice(Runnable runnable) {
    runnable.run();
    runnable.run();
  }

  /**
   * 인자가 한개 있는 메서드를 두번 실행한다.
   */
  public void doTwice(Consumer<String> consumer, String name) {
    consumer.accept(name);
    consumer.accept(name);
  }
}
