package practice;

class Test12_1 {
	String instanceArg = "instance";
	static String staticArg = "static";
	
	void instanceMethod() {
		System.out.println(instanceArg);
	}
	
	static void staticMethod() {
		System.out.println(staticArg);
	}
}

public class Chapter12_1 {
	public static void main(String[] args) {
		
		/* staticメンバ → インスタンスを生成せずに
		 *                 直接クラス名を先頭に指定する形でも参照可能 */
		// staticメンバの呼び出し
		// static変数
		System.out.println(Test12_1.staticArg);
		// staticメソッド
		Test12_1.staticMethod();
		
		System.out.println("-----------------------------------------");
		
		// インスタンスの生成
		Test12_1 t = new Test12_1();
		
		// インスタンスメンバの呼び出し
		// インスタンス変数
		System.out.println(t.instanceArg);
		// インスタンスメソッド
		t.instanceMethod();
		
		System.out.println("-----------------------------------------");
		
		// staticメンバの呼び出し
		// static変数
		System.out.println(t.staticArg);
		// staticメソッド
		t.staticMethod();
		
		System.out.println("-----------------------------------------");
		
		// staticメンバの呼び出し
		// static変数
		System.out.println(Test12_1.staticArg);
		// staticメソッド
		Test12_1.staticMethod();
	}
}
