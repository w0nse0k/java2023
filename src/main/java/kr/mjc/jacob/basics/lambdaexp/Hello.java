package kr.mjc.jacob.basics.lambdaexp;

public class Hello {
  // static hello
  static void sayHelloRachel() {
    System.out.println("안녕하세요 레이첼");
  }

  // instance hello
  void sayHelloJacob() {
    System.out.println("안녕하세요 제이콥");
  }

  // static hello
  static void sayStaticHello(String name) {
    System.out.println("안녕하세요 " + name);
  }

  // instance hello
  void sayHello(String name) {
    System.out.println("안녕하세요 " + name);
  }
}
