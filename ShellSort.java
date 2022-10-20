package sort;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {52, 896, 546, 23, 46, 853};
		shell(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shell(int[] arr) {
		int val = 0;
		int j = 0;
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				val = arr[i];
				for (j = i; j >= gap && val < arr[j - gap]; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = val;
			}
		}
	}

}
