package practice;

class Foo {
	String str; int num;
	
	// this()：コンストラクタを表す。
	// 自分自身コンストラクタのコールは、コンパイルエラー（2回初期化を行うことになるため）。
	
	public Foo() {
		// this(); コンパイルエラー
		this("データなし");
	}
	
	public Foo(String s) {
		this(s, 1);
	}
	
	public Foo(String s, int i) {
		this.str = s; this.num = i;
		System.out.println(this.str);
		System.out.println(this.num);
	}
}

public class Chapter21_5 {
	public static void main(String[] args) {
		Foo f1 = new Foo();
		Foo f2 = new Foo("データ2");
		Foo f3 = new Foo("データ3", 500);
	}
}
