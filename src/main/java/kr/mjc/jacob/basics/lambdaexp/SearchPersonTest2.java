package kr.mjc.jacob.basics.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchPersonTest2 {

  public void main() {
    List<Person> roster = new ArrayList<>();
    roster.add(new Person("Peter", 10));
    roster.add(new Person("Andre", 20));
    roster.add(new Person("Jacob", 30));
    roster.add(new Person("John", 40));

    // using lambda expression
    printPersons(roster, p -> p.age() >= 30);

    printPersons(roster, p -> p.age() >= 20 && p.age() <= 30);
  }

  public void printPersons(List<Person> roster, Predicate<Person> tester) {
    System.out.println("조건을 만족하는 사람만 출력합니다.");
    for (Person p : roster) {
      if (tester.test(p))
        System.out.println(p);
    }
  }

  public static void main(String[] args) {
    new SearchPersonTest2().main();
  }
}
