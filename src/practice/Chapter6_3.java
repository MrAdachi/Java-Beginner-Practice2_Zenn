package practice;

public class Chapter6_3 {
	public static void main(String[] args) {
		//	定数の初期化（宣言、代入）
		final int num1 = 10000;
		
		System.out.println("num1は定数で、値は" + num1 + "です。");
		
		//	定数の再代入（コンパイルエラー）
		//	num1 = 15000;
	}
}
