package practice;

public class Chapter11_2 {
	public static void main(String[] args) {
		int i = 15;
		
		// while文とdo while文の違い
		// while内の条件式を評価 → false（1回目） → 処理文は実行されない
		while(i != 15 && i == 14) {
			System.out.println(i);
		}
		
		// doの処理分を実行（1回目） → 中身が実行 → while内の条件式を評価
		do {
			System.out.println(i);
			i--;
		} while(i != 15 && i == 14);
	}
}
