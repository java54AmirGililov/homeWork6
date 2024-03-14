package telran.util.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static telran.util.ArraysInt.*;
import java.util.Arrays;

class ArraysTest {
	
int[] array = {10, 25, 30, 40, 100};

	@Test
	@DisplayName ("Test of method addNumber")
	void addNumberTest() {
		int[] arrayExpected = {10, 25, 30, 40, 100, -2};
		int[] arrayActual = addNumber(array, -2);
		assertArrayEquals(arrayExpected, arrayActual);
	}
	@Test
	@DisplayName ("Test of method insertNumber")
	void insertNumberTest() {
		int[] arrayExpectedLast = {10, 25, 30, 40, 100, 25};
		int[] arrayExpectedFirst = {25, 10, 25, 30, 40, 100};
		int[] arrayExpectedMiddle = {10, 25, 30, 25, 40, 100};
		int[] arrayActualLast = insertNumber(array, 5, 25);
		int[] arrayActualFirst = insertNumber(array, 0, 25);
		int[] arrayActualMiddle = insertNumber(array, 3, 25);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
	}
	@Test
	@DisplayName ("Test of method removeNumber")
	void removeNumberTest() {
		int[] arrayExpectedLast = {10, 25, 30, 40};
		int[] arrayExpectedFirst = {25, 30, 40, 100};
		int[] arrayExpectedMiddle = {10, 25, 40, 100};
		int[] arrayActualLast = removeNumber(array, array.length -1);
		int[] arrayActualFirst = removeNumber(array, 0);
		int[] arrayActualMiddle = removeNumber(array, 2);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
	}
	@Test
	@DisplayName ("Test of method insertSorted")
	void insertSortedTest() {
		int[] arrayExpectedLast = {10, 25, 30, 40, 100, 150};
		int[] arrayExpectedFirst = {10,10, 25, 30, 40, 100};
		int[] arrayExpectedMiddle = {10, 25, 30, 35, 40, 100};
		int[] arrayActualLast = insertSorted(array, 150);
		int[] arrayActualFirst = insertSorted(array, 10);
		int[] arrayActualMiddle = insertSorted(array, 35);
		assertArrayEquals(arrayExpectedLast, arrayActualLast);
		assertArrayEquals(arrayExpectedMiddle, arrayActualMiddle);
		assertArrayEquals(arrayExpectedFirst, arrayActualFirst);
	}
	@Test
	@DisplayName ("Test of method copyOf")
	void copyOfTest() {
		int[] arrayExpectedSameLength = {10, 25, 30, 40, 100};
		int[] arrayExpectedLessLength = {10, 25, 30};
		int[] arrayExpectedGreaterLength = {10, 25, 30, 40, 100, 0};
		int[] arrayActualSameLength = Arrays.copyOf (array, array.length);
		int[] arrayActualLessLength = Arrays.copyOf (array, array.length -2);
		int[] arrayActualGreaterLength = Arrays.copyOf (array, array.length + 1);
		assertArrayEquals(arrayExpectedSameLength, arrayActualSameLength);
		assertArrayEquals(arrayExpectedLessLength, arrayActualLessLength);
		assertArrayEquals(arrayExpectedGreaterLength, arrayActualGreaterLength);
	}
	@Test
	@DisplayName ("Test of method arraycopy")
	void arraycopyTest() {
		int[] array1 = {10, 20};
		int[] expected = {10, 25, 10, 20, 100};
		int[] arrayCopy = Arrays.copyOf(array, array.length);
		System.arraycopy(array1, 0, arrayCopy, 2, 2);
		assertArrayEquals(expected, arrayCopy);
	}
	@Test
	@DisplayName ("Test of method binarySearchInt")
	void binarySearchIntTest() {
		//TODO
	}
}