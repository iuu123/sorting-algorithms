package sort;

import java.util.Arrays;

public class MergeSort {
	private int mid;
	private int index1;
	private int index2;
	private int index;
	private int[] temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3, -45};
		ShellSort sort = new ShellSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr) {
		temp = new int[arr.length];
		separate(arr, 0, arr.length - 1, temp);
	}
	
	public void separate(int[] arr, int low, int high, int[] temp) {
		if (low < high) {
			mid = (low + high) / 2;
			separate(arr, low, mid, temp);
			separate(arr, mid + 1, high, temp);
			merge(arr, low, mid, high, temp);
		}
	}
	
	public void merge(int[] arr, int low, int mid, int high, int[] temp) {
		index = 0;
		index1 = low;
		index2 = mid + 1;
		while (index1 <= mid && index2 <= high) {
			if (arr[index1] < arr[index2]) {
				temp[index++] = arr[index1++];
			} else {
				temp[index++] = arr[index2++];
			}
		}
		while (index1 <= mid) {
			temp[index++] = arr[index1++];
		}
		while (index2 <= mid) {
			temp[index++] = arr[index2++];
		}
		for (int i = 0; i < index; i++) {
			arr[low++] = temp[i];
		}
	}

}
