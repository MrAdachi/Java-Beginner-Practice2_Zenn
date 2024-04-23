package practice;

public class Chapter9_1 {
	public static void main(String[] args) {
		// 整数
		int x = 10;
		int y = 2;
		
		System.out.println(x + y); //足し算
		System.out.println(x - y); //引き算
		System.out.println(x * y); //掛け算
		System.out.println(x / y); //割り算
		System.out.println(x % y); //剰余
		System.out.println(-(x + y)); //符号の反転
		
		System.out.println("----------------------------");
		
		// 小数
		double z = 2.0;
		
		System.out.println(x / y);
		System.out.println(x / z);
		System.out.println(x % y);
		
		String type = ((Object)(x / z)).getClass().getSimpleName();
		System.out.println(type);
		
		System.out.println("----------------------------");
		
		// 文字列の演算（文字列＋基本データ型）
		String text = "Text";
		int num1 = 2;
		double num2 = 2.0;
		boolean t = true;
		String n = null;
		
		System.out.println(text + num1);
		System.out.println(num1 + text);
		System.out.println((num1 + 5) + text);
		System.out.println(num2 + text);
		System.out.println(t + text);
		System.out.println(n + text);
	}
}
