package com.lisl.demo.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void test() {
		int[] numbers = {34, 8, 64, 51, 32, 21};
		int[] expect = {8, 21, 32, 34, 51, 64};
		
		InsertionSort.sort(numbers);
		
		assertTrue(Arrays.equals(expect, numbers));
	}

}
