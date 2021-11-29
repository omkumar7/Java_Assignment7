import java.util.*;
import java.util.stream.*;
public class TotalNumberOfElement {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(14,56,73,99);
        long count =  myList.stream()
                .count();
        System.out.println(count);
    }
}