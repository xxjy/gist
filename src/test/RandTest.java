package test;

import java.util.Random;

import util.Util;

public class RandTest {

	public static void main(String[] args) {
		rand2();
	}

	private static int num = 100;

	public static void rand2() {
		Random random = new Random();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = i + 1;
		}
		for (int i = num; i > 0; i--) {
			int curr = num - i;
			int next = curr + random.nextInt(i);

			if (curr != next) {
				array[curr] = array[curr] ^ array[next];
				array[next] = array[curr] ^ array[next];
				array[curr] = array[curr] ^ array[next];

				// array[curr] = array[curr] + array[next];
				// array[next] = array[curr] - array[next];
				// array[curr] = array[curr] - array[next];

				// int temp = array[curr];
				// array[curr] = array[next];
				// array[next] = temp;
			}

		}
		System.out.println(Util.join(array));
	}

	public static void rand1() {
		Random random = new Random();
		int[] array = new int[num];
		int total = 0;
		for (int i = 0; i < num; i++) {
			int next;

			while (exist(array, i, (next = random.nextInt(num) + 1))) {
				total++;
			}
			array[i] = next;
		}
		System.out.println(Util.join(array));
		System.out.println("total:" + total);
	}

	public static boolean exist(int[] array, int i, int next) {
		boolean exist = false;
		for (int j = 0; j < i; j++) {
			if (array[j] == next) {
				exist = true;
				break;
			}
		}
		return exist;
	}

}
