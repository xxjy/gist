package sort;

import util.Util;

public class QuickSort3 {

	public static void main(String[] args) {
		int[] i = { 2, 56, 75, 23, 35, 666, 74, 334, 33, 40 };
		System.out.println(Util.join(i));
		quickSort(i);
		System.out.println(Util.join(i));
	}

	public static void quickSort(int[] array) {
		sort(array, 0, array.length - 1);

	}

	public static void sort(int[] array, int l, int r) {
		if (l < r) {
			int i = l - 1, x = array[r];
			for (int j = l; j <= r; j++) {
				if (array[j] <= x) {
					i++;
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			sort(array, l, i - 1);
			sort(array, i + 1, r);
		}

	}

}
