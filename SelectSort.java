package sort;

import java.util.Arrays;

public class SelectSort {
	private int index;
	private int min;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3, -45};
		SelectSort sort = new SelectSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			min = arr[i];
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = min;
		}
	}

}
