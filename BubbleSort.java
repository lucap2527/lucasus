import java.util.ArrayList;
public class BubbleSort {
    public static void bubbleSort(ArrayList<Integer> arr) {
        // A bubble sort tracks between adjacents terms, or in other words two terms that are right next to each other get checked based on the specifications given
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                // The line below checks wether the term before is greater than the term following it
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    // If so the terms are swapped and the array is changed
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }
}
