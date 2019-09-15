package HAN;

import Sorter.*;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public  static void main(String[] args) {
        Integer[] sequence = {74, 59, 55, 94, 95, 26, 50, 61, 78, 82, 25, 85, 6, 37, 70, 57, 16, 4, 69, 11};
        Sorter sorter = new MergeSort<>();

        System.out.println(Arrays.toString(sequence));

        sorter.sort(sequence);

        System.out.println(Arrays.toString(sequence));
    }
}
