package kr.mjc.jacob.basics.collections;

public class HashCodeTest {
  public static void main(String[] args) {
    Long l1 = 1L;
    Long l2 = 8L;
    Long l3 = 4294967305L;
    Double pi = 3.14;
    String s1 = """
        영변에 약산 진달래꽃 아름 따다 가실 길에 뿌리오리다
        가시는 걸음걸음 놓인 그 꽃을 사뿐히 즈려밟고 가시옵소서
        나 보기가 역겨워 가실 때에는 죽어도 아니 눈물 흘리오리다
        """;
    String s2 = """
        영변에 약산 진달래꽃 아름 따다 가실 길에 뿌리오리다
        가시는 걸음걸음 놓인 그 꽃을 사뿐히 즈려밟고 가시옵소서
        나 보기가 역겨워 가실 때에는 죽어도 아니 눈물 흘리오리다.
        """;

    // 32비트 정수를 16진수 8글자로 출력
    System.out.format("l1.hashCode() = %08x\n", l1.hashCode());
    System.out.format("l2.hashCode() = %08x\n", l2.hashCode());
    System.out.format("l3.hashCode() = %08x\n", l3.hashCode());
    System.out.println(l2.equals(l3));

    System.out.format("p1.hashCode() = %08x\n", pi.hashCode());
    System.out.format("s1.hashCode() = %08x\n", s1.hashCode());
    System.out.format("s2.hashCode() = %08x\n", s2.hashCode());
    System.out.println(s1.equals(s2));
  }
}
