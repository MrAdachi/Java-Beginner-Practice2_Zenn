package practice;

public class Chapter13_2 {
	
	String instanceVal = "instance変数";
	static String staticVal = "static変数";
	
	void instanceMethod() {
		System.out.println(instanceVal);
	}
	
	static void staticMethod() {
		System.out.println(staticVal);
	}
	
	public static void main(String[] args) {
		// インスタンスメンバへのアクセス
		Chapter13_2 t = new Chapter13_2();
		System.out.println(t.instanceVal);
		// System.out.println(instanceVal); コンパイルエラー（staticメンバ → instanceメンバへの直接アクセス不可）
		
		t.instanceMethod();
		// instanceMethod();  コンパイルエラー（staticメンバ → instanceメンバへの直接アクセス不可）
		
		// staticメンバへのアクセス
		System.out.println(staticVal);
		System.out.println(Chapter13_2.staticVal);
		System.out.println(t.staticVal);
		
		staticMethod();
		Chapter13_2.staticMethod();
		t.staticMethod();
	}
}
