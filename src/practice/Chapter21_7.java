package practice;

// スーパークラス
class Super21_7 {
	public Super21_7() {
		System.out.println("Super21_7");
	}
	
	public Super21_7(int i) {
		System.out.println("SuperA int：" + i);
	}
}

// サブクラス
class Sub21_7 extends Super21_7 {
	public Sub21_7() {
		System.out.println("Sub21_7");
	}
	
	public Sub21_7(int i) {
		System.out.println("SubA int:" + i);
	}
}

public class Chapter21_7 {
	public static void main(String[] args) {
		Sub21_7 s1 = new Sub21_7();
		Sub21_7 s2 = new Sub21_7(500);
	}
}
