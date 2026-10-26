package java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Optional<String> firstNameStartingWithC = names.stream()
                .filter(name -> name.startsWith("e"))
                .findFirst();
       if( firstNameStartingWithC.isPresent()){
         System.out.println(  firstNameStartingWithC.get());
       }
        List<Integer> num = Arrays.asList(1, 2, 3, 4);
       int i = num.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
       //System.out.println(i);
        //Sort a list of strings in descending (reverse alphabetical) order.

                List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> ff =fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ff);

    }



}

