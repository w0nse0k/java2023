package kr.mjc.jacob.basics.lambdaexp;

public class MachineTest {

  public static void main(String[] args) {

    Machine machine = new Machine();

    Runnable runnable1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello Jacob.");
      }
    };
    machine.doTwice(runnable1);

    Runnable runnable2 = () -> System.out.println("Hello David.");
    machine.doTwice(runnable2);

    machine.doTwice(() -> System.out.println("Hello Rachel."));

    // method reference
    machine.doTwice(Hello::sayHelloRachel);
    machine.doTwice(new Hello()::sayHelloJacob);
  }
}

