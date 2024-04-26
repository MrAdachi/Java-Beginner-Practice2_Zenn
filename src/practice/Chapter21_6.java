package practice;

// 設計図クラス
// スーパークラス
class Super21_6 {
	int num;
	
	public Super21_6(int i) {
		this.num = i;
	}
	
	public void methodA() {
		num += 100;
	}
	
	public void print() {
		System.out.println("数値：" + num);
	}
}

// サブクラス
class Sub21_6 extends Super21_6 {
	public Sub21_6() {
		super(100); // 親のコンストラクタの実行
	}
	
	@Override
	public void methodA() {
		num += 500;
	}
	
	public void methodB() {
		methodA(); // サブクラスのメソッドを実行
		print(); //親のメソッドを実行
		super.methodA(); // 親のメソッドを実行
		print(); //親のメソッドを実行
	}
}


public class Chapter21_6 {
	public static void main(String[] args) {
		Sub21_6 s = new Sub21_6();
		s.methodB();
	}
}
