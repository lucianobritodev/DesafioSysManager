package desafio.services;

import java.util.Arrays;

public class Count {
		
	public static int countNumbers(int[] arr, int lessThan) {
		int count = 0;
		int[] arrSort = sort(arr);
		for (int num : arrSort) {
			if (num < lessThan) {
				count++;
			}
		}
		System.out.println("Total de indices menores que " + lessThan + ": " + count);
		return count;	
	}
	
	public static int[] sort(int[] arr) {
		Arrays.sort(arr);
		System.out.print("Array ordenado: ");
		printArray(arr);
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + ", ");
		}
		System.out.println();
	}
}
