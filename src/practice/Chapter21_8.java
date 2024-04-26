package practice;

// スーパークラス
class Super21_8 {
	public Super21_8() {
		System.out.println("Super21_8");
	}
	
	public Super21_8(int i) {
		System.out.println("Super21_8:" + i);
	}
}

// サブクラス
class Sub21_8 extends Super21_8 {
	public Sub21_8() {
		System.out.println("Sub21_8");
	}
	
	public Sub21_8(int i) {
		super(i); // 親のint型を受け取るコンストラクタを実行
		System.out.println("Sub21_8 int:" + i);
	}
}

public class Chapter21_8 {
	public static void main(String[] args) {
		Sub21_8 s1 = new Sub21_8();
		Sub21_8 s2 = new Sub21_8(500);
	}
}
