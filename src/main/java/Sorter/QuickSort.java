package Sorter;

public class QuickSort implements Sorter {
    private Sorter sorter = new InsertionSort();

    @Override
    public <T extends Comparable<? super T>> void sort(T[] sequence) {
        quickSort(sequence, 0, sequence.length - 1);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private <T extends Comparable<? super T>> void quickSort(T[] sequence, int low, int high) {
        T pivot;
        int CUTOFF = 10;
        if (low + CUTOFF > high) {
            sorter.sort(sequence);
        } else {
            int middle = (low + high) / 2;
            if (middle < low) {
                swap(sequence, low, middle);
            }
            if (high < low) {
                swap(sequence, low, high);
            }
            if (high < middle) {
                swap(sequence, middle, high);
            }

            swap(sequence, middle, high - 1);
            pivot = sequence[high - 1];

            int i, j;
            for (i = low, j = high - 1; ; ) {
                while (sequence[i++].compareTo(pivot) <= 0) {
                }
                while (pivot.compareTo(sequence[j--]) < 0) {
                }
                if (i >= j) {
                    break;
                }
                swap(sequence, i, j);
            }

            swap(sequence, i, high - 1);

            quickSort(sequence, low, i - 1);
            quickSort(sequence, i + 1, high);
        }
    }

    private <T extends Comparable<? super T>> void swap(T[] sequence, int position1, int position2) {
        T temp = sequence[position1];
        sequence[position1] = sequence[position2];
        sequence[position2] = temp;
    }
}
