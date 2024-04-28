package practice;

// 実行クラス
public class Chapter24_5 {
	public static void main(String[] args) {
		// 例外処理は任意
		int i = Integer.parseInt("10");
		
		System.out.println(i);
		
		// 例外処理は必須
		// FileReader r = new FileReader("sample.txt"); コンパイルエラー
	}
}
