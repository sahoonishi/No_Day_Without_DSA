import java.util.ArrayList;

public class CheckIfArrayIsSorted {
    public static boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                return false; // not sorted
            }
        }
        return true; // sorted
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();                 // IMPOERTANT
        arr1.addAll(java.util.Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(java.util.Arrays.asList(5, 4, 3, 2, 1));
        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // false
    }
}
