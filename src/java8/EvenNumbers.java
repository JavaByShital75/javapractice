package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int target = 10;

        List<List<Integer>> pairs = nums.stream()
                .flatMap(i -> nums.stream()
                        .filter(j -> i < j && i + j == target)
                        .map(j -> Arrays.asList(i, j)))
                .collect(Collectors.toList());

        System.out.println(pairs);
        



    }

}
