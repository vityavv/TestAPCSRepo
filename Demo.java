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
	}
}
