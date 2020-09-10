import java.util.*;
public class Practice_02 {
	public static void main(String[] args){
		//ABC086A
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();

		String out;
		if(b * c % 2 == 0) out = "Even";
		else out = "Odd";
		 
		// 出力
		System.out.println(out);

		sc.close();
	}
}
