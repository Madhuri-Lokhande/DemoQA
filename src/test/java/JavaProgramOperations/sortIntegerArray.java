package JavaProgramOperations;

import java.util.Arrays;

public class sortIntegerArray {

	public static void main(String[] args) {

		int[] arr = { 2, 9, 3, 1, 7, 5, 7, 0 };
	
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
