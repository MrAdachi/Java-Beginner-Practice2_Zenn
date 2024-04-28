package practice;

// 例外クラス（独自）
class MyException extends Exception {
	private int age;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}

// 実行クラス
public class Chapter24_6 {
	public static void main(String[] args) {
		try {
			int age = -1;
			checkAge(age);
		} catch(MyException e) {
			System.out.println("不正な数値となっています。 : " + e.getAge());
		}
	}
	
	public static void checkAge(int age) throws MyException {
		if(age > 0) {
			System.out.println("貴方の年齢 : " + age);
		} else {
			MyException e = new MyException(); // 例外クラスをインスタンス化
			e.setAge(age);
			throw e; // 例外オブジェクトを意図的にスロー
		}
	}
}
