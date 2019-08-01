package com.lisl.demo.sort;

public class InsertionSort {
	public static void sort(int[] numbers) {
		int length = numbers.length;
		int j;
		
		for (int i=1; i<length; i++) {
			int t = numbers[i];
			for (j = i; j>0 && numbers[j-1] > t; j --) {
				numbers[j] = numbers[j-1];
			}
			numbers[j] = t;
		}
	}
}
