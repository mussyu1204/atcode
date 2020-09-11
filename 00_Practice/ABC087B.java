import java.util.*;

public class ABC087B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt(); // 500 yen
		int b = sc.nextInt(); // 100 yen
		int c = sc.nextInt(); // 50 yen
		int x = sc.nextInt(); // X yen

		int out = 0;

		for (int i = 0; i <= a; i++) {
			if (i * 500 > x)
				break;
			for (int j = 0; j <= b; j++) {
				if (i * 500 + j * 100 > x)
					break;
				for (int k = 0; k <= c; k++) {
					if (i * 500 + j * 100 + k * 50 > x)
						break;
					if (i * 500 + j * 100 + k * 50 == x)
						out++;
				}
			}
		}

		// 出力
		System.out.println(out);

		sc.close();
	}
}
