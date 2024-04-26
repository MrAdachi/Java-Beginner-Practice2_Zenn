package practice;

// スーパークラス
class SuperA {
	public void print(String s) {
		System.out.println("スーパークラスのメソッド：" + s);
	}
	
	public void method() {}
}

// サブクラス
class SubA extends SuperA {
	// オーバーライド
	public void print(String s) {
		System.out.println("サブクラスのメソッド：" + s);
	}
	
	// void method() {} コンパイルエラー（アクセス修飾子がデフォルトなので）
}

public class Chapter21_2 {
	public static void main(String[] args) {
		SuperA superA = new SuperA();
		superA.print("テスト"); // 自分のメソッドを実行
		
		SubA subA = new SubA();
		subA.print("テスト"); // 自分のメソッドを実行
	}

}
