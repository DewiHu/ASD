package Sorter;

public interface Sorter {

    <T extends Comparable<? super T>> void sort(T[] sequence);
}
