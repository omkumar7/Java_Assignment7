import java.util.*;
import java.util.stream.*;
public class DuplicateElements {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(12,5,12,17,9,8,16,8,9,11);
        Set<Integer> set = new HashSet();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
    }
}