package practice;

// 抽象クラス
abstract class Super21_9 {
	abstract void methodA(); // abstractメソッド
	public void methodB() {
		System.out.println("抽象クラスの具象メソッド");
	}
}

// サブクラス
class Sub21_9 extends Super21_9 {
	@Override
	void methodA() {
		System.out.println("実装");
	} // 実装（抽象メソッドのオーバーライド）
	
	/* public void methodA() {
		System.out.println("実装");
	}
	アクセス修飾子が同じ、公開範囲が広いものはOK！
	*/
	
	/* public void methodB() {
		System.out.println("ただのオーバライド。");
	}
	*/
}

// 実行クラス
public class Chapter21_9 {
	public static void main(String[] args) {
		Sub21_9 s = new Sub21_9();
		s.methodA();
		s.methodB();
		
		// Super21_9 a = new Super21_9(); コンパイルエラー（抽象クラスはインスタンス化できない）
	}
}
