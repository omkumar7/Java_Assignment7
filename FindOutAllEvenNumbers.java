import java.util.Arrays;
import java.util.List;

public class FindOutAllEvenNumbers {

    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(18,12,7,48,25,99,32);
        myList.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
    }
}
