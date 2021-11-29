import java.util.*;
import java.util.stream.*;
public class StartingWithOne {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(17,25,18,49,15,17,32);
        myList.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
