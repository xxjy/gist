package sort;

import util.Util;

public class QuickSort2 {

	public static void main(String[] args) {
		int[] i = { 2, 56, 75, 23, 35, 666, 74, 334, 33 };
		System.out.println(Util.join(i));
		quickSort(i);
		System.out.println(Util.join(i));
	}

	public static void quickSort(int[] array) {
		sort(array, 0, array.length - 1);

	}

	public static void sort(int[] array, int l, int r) {
		if (l >= r) return;
		int left = l, right = r;
		int temp = array[l];
		while (left < right) {
			while (array[right] >= temp && left < right)
				right--;

			while (array[left] <= temp && left < right)
				left++;

			if (left < right) {
				int t = array[right];
				array[right] = array[left];
				array[left] = t;
			}
		}
		array[l] = array[left]; //基准数归位
		array[left] = temp;

		sort(array, l, left - 1);
		sort(array, left + 1, r);
	}

}
