package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,8,9,9,4);
       // even nos // odd nos
        List<Integer> evenNum = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);
        evenNum.forEach(i -> System.out.println(i));
        List<Integer> oddNum = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNum);
        oddNum.forEach(i -> {

                    System.out.println(i);

        } );

        List<String> names = Arrays.asList("shital", "sam","prakash", "tyson");
        names.stream().filter(s -> s.endsWith("m")).forEach(name -> System.out.println(name));
    }

}
