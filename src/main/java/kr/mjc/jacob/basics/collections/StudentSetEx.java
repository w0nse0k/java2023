package kr.mjc.jacob.basics.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Student Set 테스트
 */
public class StudentSetEx {
  public static void main(String[] args) {
    Student s1 = new Student(1, "Rachel");
    Student s2 = new Student(2, "David");
    Student s3 = new Student(1, "Rachel");

    System.out.format("%x\n", s1.hashCode());
    System.out.format("%x\n", s2.hashCode());
    System.out.format("%x\n", s3.hashCode());

    Set<Student> set1 = new HashSet<>();
    set1.add(s1);
    set1.add(s2);
    set1.add(s3);
    System.out.println(set1);
  }
}
