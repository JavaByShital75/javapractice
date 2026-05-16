package stringExample;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceByJava8 {

    public static void main(String[] args) {
        String str = "aabbbccc";
        Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(collect);
        collect.forEach((character, count) ->  System.out.println(character+" "+count));
    }
}
