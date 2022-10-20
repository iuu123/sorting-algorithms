package sort;

import java.util.Arrays;

public class BubbleSort {
	int[] arr;
	int temp;
	boolean flag;

	public BubbleSort() {
		super();
		this.temp = 0;
		this.flag = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 16, 17, 4, 3, -45};
		BubbleSort sort = new BubbleSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr) {
		this.arr = arr;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true; // 判断这一轮有没有发生交换
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if (flag) {
				flag = false;
			} else {
				break;
			}
		}
	}

}
