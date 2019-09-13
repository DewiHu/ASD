package Sorter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    private Sorter sud;

    @BeforeEach
    void setup() {
        sud = new MergeSort();
    }

    @Test
    void sortingRandomSequence() {
        //Assemble
        int[] sequence = {74, 59, 55, 94, 95, 26, 50, 61, 78, 82, 25, 85, 6, 37, 70, 57, 16, 4, 69, 11};
        int[] expectedSequence = {4, 6, 11, 16, 25, 26, 37, 50, 55, 57, 59, 61, 69, 70, 74, 78, 82, 85, 94, 95};

        //Act
        sud.sort(sequence);

        //Assert
        assertArrayEquals(expectedSequence, sequence);
    }

    @Test
    void sortingAscendingSequence() {
        //Assemble
        int[] sequence = {4, 6, 11, 16, 25, 26, 37, 50, 55, 57, 59, 61, 69, 70, 74, 78, 82, 85, 94, 95};
        int[] expectedSequence = {4, 6, 11, 16, 25, 26, 37, 50, 55, 57, 59, 61, 69, 70, 74, 78, 82, 85, 94, 95};

        //Act
        sud.sort(sequence);

        //Assert
        assertArrayEquals(expectedSequence, sequence);
    }


    @Test
    void sortingDescendingSequence() {
        //Assemble
        int[] sequence = {95, 94, 85, 82, 78, 74, 70, 69, 61, 59, 57, 55, 50, 37, 26, 25, 16, 11, 6, 4};
        int[] expectedSequence = {4, 6, 11, 16, 25, 26, 37, 50, 55, 57, 59, 61, 69, 70, 74, 78, 82, 85, 94, 95};

        //Act
        sud.sort(sequence);

        //Assert
        assertArrayEquals(expectedSequence, sequence);
    }

    @Test
    void sortingEvenSequence() {
        //Assemble
        int[] sequence = {1, 2, 3, 4, 4, 3, 2, 1, 2, 3, 4, 1, 3, 2, 1, 4, 1, 4, 3, 2};
        int[] expectedSequence = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4};


        //Act
        sud.sort(sequence);

        //Assert
        assertArrayEquals(expectedSequence, sequence);
    }

    @Test
    void sortingEmptySequence() {
        int[] sequence = {};
        int[] expectedSequence = {};

        //Act
        sud.sort(sequence);

        //Assert
        assertArrayEquals(expectedSequence, sequence);
    }
}