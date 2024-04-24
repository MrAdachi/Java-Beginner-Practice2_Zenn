package practice;

public class Chapter11_8 {
	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++) {
			if(i == 3) {
				continue;
				/* 同じブロック内でcontinue文の後に処理を書くことはコンパイルエラー
				   （continue後の処理は結局実行されないから文法的にアウト）
				 */
				// System.out.println(i);
			}
			System.out.println(i);
		}
	}
}
