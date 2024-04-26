package practice;

// インターフェース1
interface Inter1 {
	double methodA(int i);
	default void methodB() {
		System.out.println("methodB");
	}
}

// インターフェース2
interface Inter2 {
	int methodC(int i1, int i2);
	static void methodD() {
		System.out.println("methodD");
	}
}

// 実装クラス
class Test21_10 implements Inter1, Inter2 {
	public double methodA(int i) {
		return i + 10;
	}
	
	public int methodC(int i1, int i2) {
		return i1 + i2;
	}
}

// 実行クラス
public class Chapter21_10 {
	public static void main(String[] args) {
		Test21_10 t = new Test21_10();
		
		System.out.println("methodA:" + t.methodA(1));
		System.out.println("methodC:" + t.methodC(1, 2));
		
		t.methodB();
		Inter2.methodD();
		
		// t,methodD(); コンパイルエラー（拡張したものではないので、実装クラスにはない。）
	}
}
