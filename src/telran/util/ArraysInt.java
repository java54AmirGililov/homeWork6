package telran.util;

import java.util.Arrays;

public class ArraysInt {
    public static int[] addNumber(int[] array, int number) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[array.length] = number;
        return result;
	}
	public static int[] insertNumber (int[] array, int index, int number) {
		int [] result = array;
		if (index > -1 && index <= array.length) {
			result = new int [array.length + 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index, result, index +1, array.length - index);
			result [index] = number;
		}
		return result;
	}
	public static int[] removeNumber (int[] array, int index) {
		int [] result = array;
		if (index > -1 || index >= array.length) {
			result = new int [array.length - 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index + 1, result, index, array.length - index -1);
		}
		return result;
	}
	public static int[] insertSorted (int[] sortedArray, int number) {
		//TODO
		//insert number into sorted array with keeping their sorted order
		//apply method binarySearch of the class Arrays
		return null;
	}
}
