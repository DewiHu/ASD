package Sorter;

public class QuickSort implements Sorter {
    private Sorter sorter = new InsertionSort();

    @Override
    public void sort(int[] sequence) {
        quickSort(sequence, 0, sequence.length - 1);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private void quickSort(int[] sequence, int low, int high) {
        int pivot;
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
                while (sequence[i++] < pivot) {
                }
                while (pivot < sequence[j--]) {
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

    private void swap(int[] sequence, int position1, int position2) {
        int temp = sequence[position1];
        sequence[position1] = sequence[position2];
        sequence[position2] = temp;
    }
}
