package sort;

import java.util.Arrays;

public class InsertSort {
	private int val;
	private int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3, -45};
		InsertSort sort = new InsertSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			val = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (val < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = val;
		}
	}
	
}
