package Laba5;
import java.util.*;

public class ArrayCollections {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 8, 5, 1);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        Collections.fill(numbers, 5);
        System.out.println("Filled with 5: " + numbers);

        numbers = Arrays.asList(3, 7, 2, 8, 5, 1);
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));


        List<Integer> copy = new ArrayList<>(Arrays.asList(new Integer[numbers.size()]));
        Collections.copy(copy, numbers);
        System.out.println("Copied: " + copy);

        Collections.rotate(numbers, 10);
        System.out.println("Rotated: " + numbers);

        List<String> checkedList = Collections.checkedList(new ArrayList<>(), String.class);
        checkedList.add("Hello");
        System.out.println("Checked List: " + checkedList);

        numbers = Arrays.asList(3, 7, 2, 8, 5, 1, 3, 3);
        System.out.println("Frequency of 3: " + Collections.frequency(numbers, 3));
    }
}
