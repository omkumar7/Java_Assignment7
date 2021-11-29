import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class SortDesendingOrder {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(34,12,32,45,1,3,7);

        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}