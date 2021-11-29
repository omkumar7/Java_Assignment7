import java.util.*;
import java.util.stream.*;
public class MaximumNumber {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(45,46,2,88,93);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}