package Sorter;

public class InsertionSort<T> implements Sorter {

    @Override
    public <T extends Comparable<? super T>> void sort(T[] sequence) {
        for (int i = 1; i < sequence.length; i++) {
            T toBeInserted = sequence[i];

            int j = i;
            while (j > 0 && toBeInserted.compareTo(sequence[j - 1]) < 0 ) {
                sequence[j] = sequence[j - 1];
                j--;
            }

            sequence[j] = toBeInserted;
        }
    }
}
