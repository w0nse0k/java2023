package kr.mjc.jacob.basics.lambdaexp;

import java.util.function.Consumer;

public class MachineTest2 {

  public static void main(String[] args) {

    Machine machine = new Machine();

    Consumer<String> consumer1 = new Consumer<>() {
      @Override
      public void accept(String name) {
        System.out.println("Hello " + name);
      }
    };

    machine.doTwice(consumer1, "Rachel");

    Consumer<String> consumer2 = (name) -> System.out.println("Hello " + name);
    machine.doTwice(consumer2, "Jacob");

    machine.doTwice((name) -> System.out.println(name), "David");

    // method reference
    machine.doTwice(Hello::sayStaticHello, "Paul");
    machine.doTwice(new Hello()::sayHello, "Peter");
    machine.doTwice(System.out::println, "Say good bye");
  }
}

