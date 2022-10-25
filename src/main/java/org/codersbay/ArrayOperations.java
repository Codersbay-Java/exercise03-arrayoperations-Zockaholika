package org.codersbay;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
        System.out.println(numbers);
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
        Arrays.sort(numbers);
        return numbers;
    }

    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
        sort();
        return reverseArray();
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
        reverseArray();
        return numbers;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
        boolean boolForReturn = false;
        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i]){
                boolForReturn = true;
            }
        }
        return boolForReturn;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        sum = sum / numbers.length;
        return sum;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
        sort();
        double sum = 0;
        for (int i = 1; i < numbers.length - 1 ; i++) {
            sum = sum +numbers[i];
        }
        return sum / (numbers.length-2);
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
        sort();
        return numbers[numbers.length-1];
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
        sort();
        return numbers[0];
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    public int[] reverseArray() {
        int j = numbers.length-1;
        int[] copiNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            copiNumber[j] = numbers[i];
            j--;
        }
        numbers = copiNumber;
        return numbers;
    }
}