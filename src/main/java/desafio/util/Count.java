package desafio.util;

import java.util.Arrays;

public class Count {
		
	public static int countNumbers(int[] arr, int lessThan) {
		int[] arrSort = sort(arr);
		System.out.print("\nArray ordenado: " + Arrays.toString(arrSort));
		
		int count = (int) Arrays.stream(arr).filter(num -> num < lessThan).count();
		
		System.out.print("\nTotal de indices menores que " + lessThan + ": " + count);
		return count;	
	}
	
	public static int[] sort(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	
}
