package practice;

class Test12_11 {
	// ③
	static {
		System.out.println("staticイニシャライザ(Test)");
	}
	
	// ④
	Test12_11(String s) {
		System.out.println(s);
	}
}

public class Chapter12_11 {
	// ①
	static {
		System.out.println("staticイニシャライザ");
	}
	
	// ②
	public static void main(String[] args) {
		System.out.println("mainメソッド");
		
		Test12_11 t = new Test12_11("コンストラクタ");
	}
	
}
