package sort;

import java.util.Arrays;

public class QuickSort {
	private int index1;
	private int index2;
	private int mid;
	private int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3, -45};
		ShellSort sort = new ShellSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr) {
		sort1(arr, 0, arr.length - 1);
	}
	
	public void sort1(int[] arr, int low, int high) {
		if (low > high) {
			return;
		}
		mid = arr[high]; // 设置中间值为最高位的值
		// 把小于中间值的与大于等于中间值的进行交换，使小于中间值的位于最前方
		for (index1 = low, index2 = low; index2 < high; index2++) {
			if (arr[index2] < mid) { 
				temp = arr[index2];
				arr[index2++] = arr[index1];
				arr[index1++] = temp;
			} else {
				index2++;
			}
		}
		// 把中间值与所有小于中间值的后一位进行交换
		temp = arr[index1];
		arr[index1] = mid;
		arr[high] = temp;
		sort1(arr, low, index1 - 1);
		sort1(arr, index1 + 1, high);
	}

}
