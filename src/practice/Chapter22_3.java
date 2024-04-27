package practice;

class Super22_3 {
	public void foo() {
		System.out.println("TestA");
	}
}

class Sub22_3 extends Super22_3 {
	public void foo() {
		System.out.println("TestB");
	}
}

public class Chapter22_3 {
	public static void main(String[] args) {
		Super22_3 obj = new Sub22_3();
		// obj.foo(); コンパイルエラー
	}
}
