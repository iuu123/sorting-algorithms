package sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {52, 896, 546, 23, 46};
		insert(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insert(int[] arr) {
		int val = 0;
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			val = arr[i];
			index = i - 1;
			while (index >= 0 && val < arr[index]) {
				arr[index + 1] = arr[index];
				index--;
			}
			arr[index + 1] = val; 
		}
	}

}
