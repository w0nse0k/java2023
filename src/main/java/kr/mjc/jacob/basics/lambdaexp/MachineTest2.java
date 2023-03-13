package kr.mjc.jacob.basics.lambdaexp;

import java.util.function.Consumer;

public class MachineTest2 {

  public static void main(String[] args) {

    Machine machine = new Machine();

    // anonymous class
    Consumer<String> c1 = new Consumer<>() {
      @Override
      public void accept(String name) {
        System.out.println("Hello " + name);
      }
    };

    machine.doTwice(c1, "Rachel");

    // lambda expression
    Consumer<String> c2 = (name) -> System.out.println("Hello " + name);
    machine.doTwice(c2, "Jacob");

    machine.doTwice((name) -> System.out.println("Hello " + name), "David");

    // method reference
    machine.doTwice(Hello::sayStaticHello, "Paul");
    machine.doTwice(new Hello()::sayHello, "Peter");
    machine.doTwice(System.out::println, "Say good bye");
  }
}

