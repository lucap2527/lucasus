import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
public class Sorts {
    private final ArrayList<Integer> data = new ArrayList<>();
    private final Duration timeElapsed;
    public Sorts(int size, String sortType) {
        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            data.add((int) (Math.random() * (size + 1)));
        }
        switch (sortType) {
            // This is what checks for the user input and determines which sort type to run, each one has a specified number attached to it that the scanner tracks for upon user input
            case "2":
                MergeSort.mergeSort(data);
                break;
            case "3":
                InsertionSort.insertionSort(data);
                break;
            case "4":
                BubbleSort.bubbleSort(data);
                break;
            default:
                System.out.println("Invalid sort type");
                break;
        }
        // This is what tracks the time elapsed between start and end
        Instant end = Instant.now(); // time capture -- end
        this.timeElapsed = Duration.between(start, end);
    }
    // This is what returns the data so that it may be used elsewhere in the code
    public ArrayList<Integer> getData() {
        return data;
    }
    // Runs the time elasped function as described above
    public int getTimeElapsed() {
        return timeElapsed.getNano();
    }
    // The below function recieves the average of the sort in 12 trials, that's why TIMES = 12
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sortOption;
        int sum = 0, time = 0;
        int TIMES = 12;
        int SIZE = 92364;
        // This is where the sort type question is actually asked in the console
        while (true) {
            System.out.println("Would you like to run a selection sort 1 Merge Sort 2 Insertion Sort 3 or Bubble Sort 4 ?");
            // This scanner tracks what the user inputs on the next line and sees if they're either 1, 2,3 or 4
            sortOption = scanner.next();
            if (sortOption.equals("1") || sortOption.equals("2") || sortOption.equals("3"))
                break;
        }
        for (int i = 0; i < TIMES; i++) {
            Sorts s = new Sorts(SIZE, sortOption);
            for (int j = 0; j < s.getData().size(); j++) {
                sum += s.getData().get(j);
            }
            // This prints the average random and the time elapsed from start to end in nanoseconds
            System.out.println("Average random: " + sum / ((i + 1) * SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
        }
        // Test code and the scanner closes
        System.out.println("Average: " + sum / (TIMES * SIZE));
        System.out.println("Total Nanoseconds: " + time);
        System.out.println("Total Seconds: " + time / 1000000000.0);
        scanner.close();
  }
}
