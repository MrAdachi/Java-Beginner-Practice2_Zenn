package practice;

// スーパークラス
class Super22_2 {
	void methodA() {};
}

// サブクラス
class Sub22_2 extends Super22_2 {
	void methodA() {};
	void methodB() {};
}

public class Chapter22_2 {
	public static void main(String[] args) {
		Super22_2 obj1 = new Sub22_2();
		obj1.methodA();
		// obj1.methodB(); コンパイルエラー
		
		// インスタンスをsubクラスにキャストする
		Sub22_2 obj2 = (Sub22_2)obj1;
		obj2.methodB();
	}
}
