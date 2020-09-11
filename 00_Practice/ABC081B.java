import java.util.*;

public class ABC081B {
	public static void main(String[] args) {
		// ABC081B
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int n = sc.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		boolean isOdd = false;
		int out = -1;
		while (isOdd == false) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					a[i] = a[i] / 2;
				} else {
					isOdd = true;
					break;
				}
			}
			out ++;
		}
		// 出力
		System.out.println(out);

		sc.close();
	}
}
