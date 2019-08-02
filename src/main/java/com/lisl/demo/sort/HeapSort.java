package com.lisl.demo.sort;

public class HeapSort {
	public static void constructMaxHeap(int[] numbers) {
		constructMaxHeap(numbers, numbers.length);
	}

	public static void sort(int[] numbers) {
		for (int i = numbers.length; i > 0; i--) {
			constructMaxHeap(numbers, i);
			swap(numbers, 0, i - 1);
		}
	}
	
	public static void constructMaxHeap(int[] numbers, int length) {
		int parentNodeNum = length / 2;

		for (int i = parentNodeNum - 1; i >= 0; i--) {
			constructMaxHeap(numbers, i, length);
		}

	}

	private static void constructMaxHeap(int[] numbers, int i, int length) {
		if (i >= length)
			return;

		int p = i;
		int pVal = numbers[p];
		// left sub node
		int sub = 2 * p + 1;

		while (sub < length) {
			// if right node exist and right node bigger than left node
			if (sub + 1 < length && numbers[sub + 1] > numbers[sub]) {
				sub++;
			}

			// parent node bigger than sub nodes
			if (pVal > numbers[sub]) {
				break;
			}

			numbers[p] = numbers[sub];
			p = sub;
			// left sub node
			sub = 2 * p + 1;
		}
		numbers[p] = pVal;

	}

	private static void swap(int[] numbers, int p, int s) {
		int tmp = numbers[p];
		numbers[p] = numbers[s];
		numbers[s] = tmp;
	}



}
