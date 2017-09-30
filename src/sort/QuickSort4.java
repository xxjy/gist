package sort;

import util.Util;

public class QuickSort4 {

	public static void main(String[] args) {
		int[] i = { 2, 56, 75, 23, 35, 666, 74, 334, 33 };
		System.out.println(Util.join(i));
		quickSort(i, 0, i.length - 1);
		System.out.println(Util.join(i));
	}

	public static void quickSort(int[] array, int left, int right) {

		if (left < right) {
			int sort = sort(array, left, right);
			quickSort(array, left, sort - 1);
			quickSort(array, sort + 1, right);
		}

	}

	public static int sort(int[] array, int left, int right) {
		int temp = array[left];
		while (left < right) {
			while (array[right] >= temp && left < right)
				right--;
			if (left < right) {
				int t = array[right];
				array[right] = array[left];
				array[left] = t;
			}
			while (array[left] <= temp && left < right)
				left++;

			if (left < right) {
				int t = array[right];
				array[right] = array[left];
				array[left] = t;
			}
		}
		return left;
	}

}
