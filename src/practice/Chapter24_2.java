package practice;

public class Chapter24_2 {
	public static void main(String[] args) {
		int[] i = new int[5];
		
		i[0] = 10; i[2] = 30; i[4] = 50;
		
		for(int j = 0; j < i.length; j++) {
			// 例外処理
			try {
				System.out.print(i[j]);
				System.out.println((":" + (j + 1) + "回目のループ"));
			} catch(NullPointerException | ArithmeticException e) { // 複数の例外クラスの指定
				System.out.println("nullです。");
			} catch(Exception e) { // 例外クラスの定義順序（継承関係がある場合）
				System.out.println("エラー発生");
			} finally {
				System.out.println("finally");
			}
		}
	}
}
