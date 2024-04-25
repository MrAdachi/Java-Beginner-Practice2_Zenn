package practice;

class Test13_3 {
	String instanceVal = "instance変数";
	static String staticVal = "static変数";
	
	void instancemethod() {
		System.out.println(instanceVal);
	}
	
	static void staticmethod() {
		System.out.println(staticVal);
	}
	
	void instancemethodB() {
		System.out.println(staticVal);
	}
	
	static void staticmethodB() {
		// ローカル変数のインスタンス生成が無いとエラー
		Test13_3 t2 = new Test13_3();
		System.out.println(t2.instanceVal);
	}
}


public class Chapter13_3 {
	public static void main(String[] args) {
		
		// インスタンスメンバ
		Test13_3 t = new Test13_3();
		System.out.println(t.instanceVal);
		t.instancemethod();
		t.instancemethodB();
		
		// staticメンバ
		System.out.println(Test13_3.staticVal);
		Test13_3.staticmethod();
		Test13_3.staticmethodB();
		
		// 以下でも問題なし　※staticメンバのみ。ただし基本的にはクラス名指定で覚えた方が良いかも・・・。
		System.out.println(t.staticVal);
		t.staticmethod();
		t.staticmethodB();
	}
}
