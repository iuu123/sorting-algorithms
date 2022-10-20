package sort;

import java.util.Arrays;

public class RadixSort {
	private int[] index = new int[10];
	private int[][] bucket;
	private int max;
	private int left;
	private int d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3, -45};
		ShellSort sort = new ShellSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr) {
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		max = (max + "").length();
		bucket = new int[10][arr.length];
		for (int i = 1, n = 1; i <= max; i++, n *= 10) {
			for (int j = 0; j < arr.length; j++) {
				left = arr[j] / n % 10;
				bucket[left][index[left]++] = arr[j];
			}
			for (int m = 0; m < 10; m++) {
				for (int k = 0; k < index[m]; k++) {
					arr[d++] = bucket[m][k];
				}
				index[m] = 0;
			}
		}
	}

}
