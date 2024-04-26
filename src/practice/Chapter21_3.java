package practice;

class SuperC {
	void print(String s) {
		System.out.println("スーパークラスのメソッド：" + s);
	}
}

class SubC extends SuperC {
	@Override // Overrideアノテーション
	void print(String s) {
		System.out.println("サブクラスのメソッド：" + s);
	}
	/* void printt(String s) {
		System.out.println("サブクラスのメソッド：" + s);
	}
	Overrideアノテーションを付与した後、
	superクラスと全く同じメソッド・引数で無い場合、コンパイルエラーを出してくれる。
	*/
}

public class Chapter21_3 {
	public static void main(String[] args) {
		SuperC superC = new SuperC();
		superC.print("Test");
		
		SubC subC = new SubC();
		subC.print("Test");
	}
}
