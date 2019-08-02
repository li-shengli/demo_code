package com.lisl.demo.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class HeapSortTest {

	@Test
	public void test_constructMaxHeap() {
		int[] numbers = {5,2,6,0,3,9,1,7,4,8};
		int[] expect = {9,8,6,7,3,5,1,0,4,2};
		
		HeapSort.constructMaxHeap(numbers);
		System.out.println(Arrays.toString(numbers));
		
		assertTrue(Arrays.equals(expect, numbers));
		
	}
	
	@Test
	public void test_sort() {
		int[] numbers = {5,2,6,0,3,9,1,7,4,8};
		int[] expect = {0,1,2,3,4,5,6,7,8,9};
		
		HeapSort.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		assertTrue(Arrays.equals(expect, numbers));
		
	}

}
