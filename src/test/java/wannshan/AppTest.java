package wannshan;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    public static void main(String[] args) {
        BCryptPasswordEncoder S=  new BCryptPasswordEncoder();
 System.out.println(S.encode("654321"));
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//        features.forEach(n -> System.out.println(n));
//        features.for

// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
// 看起来像C++的作用域解析运算符
//        features.forEach(System.out::println);

        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

//        System.out.println("Languages which starts with J :");
//        filter(languages, (str)->str.startsWith("J"));
//
//        System.out.println("Languages which ends with a ");
//        filter(languages, (str)->str.endsWith("a"));
//
//        System.out.println("Print all languages :");
//        filter(languages, (str)->true);
//
//        System.out.println("Print no language : ");
//        filter(languages, (str)->false);
//
//        System.out.println("Print language whose length greater than 4:");
//        filter(languages, (str)->str.length() > 4);
//        filter2(languages, (str)->str.endsWith("a"));
//        Predicate<String> starta=(str)->str.endsWith("a");
//        Predicate<String> width4=(str)->str.length()==4;
//
//        languages.stream().filter(starta.and(width4)).forEach(System.out::println);

        List<Double> costBeforeTax = Arrays.asList(100d, 200d, 300d, 400d, 500d);
        costBeforeTax.stream().map((cost) -> cost*1.2).forEach(System.out::println);
        double bill= costBeforeTax.stream().map((cost)->cost*1.2).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);

        // 创建一个字符串列表，每个字符串长度大于2
        List<String> filtered = languages.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", languages, filtered);

        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String reslut=G7.stream().map((x)->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(reslut);

        List<Integer> numbers=Arrays.asList(4,6,7,8,4,3,7);
        List<Integer> distinct= numbers.stream().map((x)->x*x).distinct().collect(Collectors.toList());

        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);

        IntSummaryStatistics stats= numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.print(stats.getAverage());
    }

    public static void filter(List<String> names, Predicate<String> condition) {
        for(String name: names)  {
            if(condition.test(name)) {
                System.out.println(name + " ");
            }
        }
    }

    public static void filter2(List<String> names, Predicate<String> condition) {
        names.stream().filter(
                (name) -> (condition.test(name))
        ).forEach(
                (name) -> {
            System.out.println(name + " ");
        }
        );
    }
}
