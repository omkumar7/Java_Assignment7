import java.util.*;
import java.util.stream.*;
public class FirstElement {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(7,4,3,5,8,9,0);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}