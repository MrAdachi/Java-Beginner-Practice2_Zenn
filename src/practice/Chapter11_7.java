package practice;

public class Chapter11_7 {
	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++) {
			if(i == 3) {
				break;
				/* 同じブロック内でbreak文の後に処理を書くことはコンパイルエラー
				   （break後の処理は結局実行されないから文法的にアウト）
				 */
				// System.out.println(i);
			}
			System.out.println(i);
		}
	}
}
