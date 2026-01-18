package Practice;
import java.util.*;

public class CommonInArrayUsingHashSet {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Convert first array to HashSet
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        // Find common elements
        Set<Integer> common = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        // Print common elements
        System.out.println("Common elements: " + common);
    }
}
