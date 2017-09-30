package sort;

import util.Util;

public class QuickSort {

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
		int pivot = l, left = l, right = r;

		while (left < right) {
			if (pivot == left) {
				if (array[right] < array[pivot]) {
					int temp = array[pivot];
					array[pivot] = array[right];
					array[right] = temp;
					pivot = right;
				} else {
					right--;
				}

			} else {
				if (array[left] > array[pivot]) {
					int temp = array[pivot];
					array[pivot] = array[left];
					array[left] = temp;
					pivot = left;
				} else {
					left++;
				}
			}
		}
		if (l < left - 1) {
			sort(array, l, left - 1);
		}
		if (left + 1 < r) {
			sort(array, left + 1, r);
		}
	}

}
