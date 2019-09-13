package Sorter;

public class InsertionSort implements Sorter {
    @Override
    public void sort(int[] sequence) {
        for (int i = 1; i < sequence.length; i++) {
            int toBeInserted = sequence[i];

            int j = i;
            while (j > 0 && toBeInserted < sequence[j - 1]) {
                sequence[j] = sequence[j - 1];
                j--;
            }

            sequence[j] = toBeInserted;
        }

    }
}
