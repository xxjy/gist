package util;

public class Util {

	public static String join(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i : array) {
			sb.append(i).append(",");
		}
		if (array.length > 0) {
			sb.setLength(sb.length() - 1);
		}
		return sb.toString();
	}

}
