package practice;

// スーパークラス
class Super22_5 {
	static String x = "スーパーstatic変数";
	String y = "スーパーインスタンス変数";
	
	static void methodA() {
		System.out.println("スーパーstaticメソッド");
	}
	
	void methodB() {
		System.out.println("スーパーインスタンスメソッド");
	}
}

// サブクラス
class Sub22_5 extends Super22_5 {
	static String x = "サブstatic変数";
	String y = "サブインスタンス変数";
	
	static void methodA() {
		System.out.println("サブstaticメソッド");
	}
	
	void methodB() {
		System.out.println("サブインスタンスメソッド");
	}
}

public class Chapter22_5 {
	public static void main(String[] arg) {
		Super22_5 obj = new Sub22_5(); // 自動型変換
		
		/* 子オブジェクトを親オブジェクトのデータ型に自動で変換した場合、
		 * インスタンスメソッド以外はスーパークラスのメンバが呼び出される。
		 * （①、②、③）
		 */
		System.out.println(obj.x); // ①
		System.out.println(obj.y); // ②
		obj.methodA(); // ③
		obj.methodB(); // ④
	}
}
