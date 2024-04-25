package practice;

class Test13_1 {
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
	
	/* static void staticmethodB() {
		System.out.println(instanceVal);
	}
	staticメンバからインスタンスメンバへのアクセス → コンパイルエラー
	*/
	
	// Test t = new Test(); ここに定義したらtもインスタンスメンバ
	
	static void staticMethodB() {
		Test13_1 t = new Test13_1(); // ローカル変数として定義しないとNG！
		t.instancemethod();
	}
}

public class Chapter13_1 {
	public static void main(String[] args) {
		Test13_1 t = new Test13_1();
		
		System.out.println(t.instanceVal);
		System.out.println(t.staticVal);
		System.out.println(Test13_1.staticVal);
		
		t.instancemethod();
		t.staticmethod();
		t.instancemethodB();
		t.staticMethodB();
	}
}
