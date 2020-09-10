import java.util.*;

public class Practice_03 {
	public static void main(String[] args) {
		//ABC081A
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int a = sc.nextInt();

		int out = 0;
		for (int i = 0; i < 3; i++) {
			out += (a % 2);
			a = a / 2;
		}
		// 出力
		System.out.println(out);

		sc.close();
	}
}
