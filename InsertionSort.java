import java.util.ArrayList;
public class InsertionSort {
    // A insertion sort works a bit differently by working one term at a time, for example it goes through the array list
    // and determines where that term should go based on the specifications (greater or lower for example)
    public static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            // This gets the value from the array list
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                // This changes the array and re sets it.
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
   }
 }
}
