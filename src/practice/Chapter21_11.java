package practice;

// インターフェース1
interface Inter21_11_1 {
	// public abstract void methodA(); ← 本来の記述
	void methodA();
}

// インターフェース2
interface Inter21_11_2 {
	void methodB();
}

// インターフェース3（複数継承（インターフェース1,2））
interface Inter21_11_3 extends Inter21_11_1, Inter21_11_2 {
	void methodC();
}

// 設計図クラス
class Test21_11 implements Inter21_11_3 {
	public void methodA() {
		System.out.println("methodA");
	}
	
	public void methodB() {
		System.out.println("methodB");
	}
	
	public void methodC() {
		System.out.println("methodC");
	}
}

// 実行クラス
public class Chapter21_11 {
	public static void main(String[] args) {
		Test21_11 t = new Test21_11();
		t.methodA();
		t.methodB();
		t.methodC();
	}
}
