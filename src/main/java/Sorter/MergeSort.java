package Sorter;

public class MergeSort<T> implements Sorter{

    @Override
    public <T extends Comparable<? super T>> void sort(T[] sequence) {
        T[] tmpArray = (T[]) new Comparable[sequence.length];
        mergeSort(sequence, tmpArray, 0, sequence.length - 1);
    }

    private <T extends Comparable<? super T>> void mergeSort(T[] sequence, T[] tmpArray, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(sequence, tmpArray, left, center);
            mergeSort(sequence, tmpArray, center + 1, right);
            merge(sequence, tmpArray, left, center + 1, right);
        }
    }

    private <T extends Comparable<? super T>> void merge(T[] sequence, T[] tmpArray, int positionLeft, int positionRight, int positionRightEnd) {
        int positionTmp = positionLeft;
        int positionLeftEnd = positionRight - 1;
        int numberOfElements = positionRightEnd - positionLeft + 1;

        while (positionLeft <= positionLeftEnd && positionRight <= positionRightEnd) {
            if (sequence[positionLeft].compareTo(sequence[positionRight]) <= 0) {
                tmpArray[positionTmp++] = sequence[positionLeft++];
            } else {
                tmpArray[positionTmp++] = sequence[positionRight++];
            }
        }

        while (positionLeft <= positionLeftEnd) {
            tmpArray[positionTmp++] = sequence[positionLeft++];
        }

        while (positionRight <= positionRightEnd) {
            tmpArray[positionTmp++] = sequence[positionRight++];
        }

        for (int i = 0; i < numberOfElements; i++, positionRightEnd--) {
            sequence[positionRightEnd] = tmpArray[positionRightEnd];
        }
    }
}
