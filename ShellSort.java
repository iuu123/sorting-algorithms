package sort;

import java.util.Arrays;

public class ShellSort {
	private int gap;
	private int val;
	private int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3, -45};
		ShellSort sort = new ShellSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void sort(int[] arr) {
		for (gap = arr.length; gap > 0; gap /= 2) { // 设置步长，每次循环结束后步长除2
			for (int i = gap; i < arr.length; i++) {
				val = arr[i];
				for (j = i - gap; j >= 0; j -= gap) {
					if (val < arr[j]) {
						arr[j + gap] = arr[j];
					} else {
						break;
					}
				}
				arr[j + gap] = val;
			}
		}
	}
	
}
