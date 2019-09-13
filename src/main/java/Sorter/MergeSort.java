package Sorter;

public class MergeSort implements Sorter {
    @Override
    public void sort(int[] sequence) {
        int[] tmpArray = new int[sequence.length];
        mergeSort(sequence, tmpArray, 0, sequence.length - 1);
    }

    private void mergeSort(int[] sequence, int[] tmpArray, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(sequence, tmpArray, left, center);
            mergeSort(sequence, tmpArray, center + 1, right);
            merge(sequence, tmpArray, left, center + 1, right);
        }
    }

    private void merge(int[] sequence, int[] tmpArray, int positionLeft, int positionRight, int positionRightEnd) {
        int positionTmp = positionLeft;
        int positionLeftEnd = positionRight - 1;
        int numberOfElements = positionRightEnd - positionLeft + 1;

        while (positionLeft <= positionLeftEnd && positionRight <= positionRightEnd) {
            if (sequence[positionLeft] <= sequence[positionRight]) {
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
