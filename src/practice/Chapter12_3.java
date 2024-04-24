package practice;

class Test {
	String instanceVal = "instanceVal";
	static String staticVal = "staticVal";
}

public class Chapter12_3 {
	public static void main(String[] args) {
		Test t = null; // インスタンスではない
		
		// System.out.println(t.instanceVal); 実行エラー
		System.out.println(t.staticVal);
	}
}
