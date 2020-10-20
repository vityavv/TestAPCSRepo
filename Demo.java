public class Demo {
	public static void main(String[] args) {
		int n = 5;
		if (args.length >= 1) {
			n = Integer.parseInt(args[0]);
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println(arrDeepToString(create2DArray(5, 5, 5)));
		System.out.println(arrDeepToString(create2DArrayRandomized(5, 5, 5)));
	}
	public static int[][] create2DArray(int rows, int cols, int maxValue) {
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = (int)(Math.random() * maxValue);
			}
		}
		return result;
	}
	public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
		int[][] result = new int[rows][];
		for (int i = 0; i < rows; i++) {
			result[i] = new int[(int)(Math.random() * (cols+1))];
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = (int)(Math.random() * maxValue);
			}
		}
		return result;
	}
	public static String arrDeepToString(int[][] arr) {
		String res = "{";
		for (int i = 0; i < arr.length; i++) {
			res += arrToString(arr[i]);
			if (i < arr.length - 1) {
				res += ", ";
			}
		}
		return res + "}";
	}
	public static String arrToString(int[] arr){
		String res = "{";
		for (int i = 0; i < arr.length; i++) {
			res += String.valueOf(arr[i]);
			if (i < arr.length - 1) {
				res += ", ";
			}
		}
		return res + "}";
	}
}
