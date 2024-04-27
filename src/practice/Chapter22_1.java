package practice;

// スーパークラス
abstract class Super22_1 {
	int x; int y;
	public abstract void print();
	public void method(int x, int y) {
		this.x = x; this.y = y;
	}
}

// サブクラス
class Sub22_1 extends Super22_1 {
	public void print() {
		System.out.println("インスタンス変数;" + x + y);
	}
}

// 実行クラス
public class Chapter22_1 {
	public static void main(String[] args) {
		Super22_1 obj = new Sub22_1();
		obj.method(10, 20);
		obj.print(); // インスタンス化しているSubクラスのメソッドを実行する
	}
}
