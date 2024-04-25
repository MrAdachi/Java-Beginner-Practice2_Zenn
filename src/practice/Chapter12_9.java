package practice;

class Test12_9 {
	
	void method1(String s, int... a) {
		System.out.println(s + "size" + a.length);
		for(int i : a) {
			System.out.println("第二引数の値" + i);
		}
	}
	
	// 第二引数を"String [] ～～"で書くとエラー発生
	void method2(int b, String... s1_array) {
		
        System.out.println(b);
		
		for(String s : s1_array) {
			System.out.println("第一引数の値" + s);
		}
	}
	
}

public class Chapter12_9 {
	public static void main(String[] args) {
		Test12_9 t = new Test12_9();
		
		t.method1("1回目");
		t.method1("2回目", 1);
		t.method1("3回目", 1, 2);
		t.method1("4回目", 1, 2, 3);
		
		t.method2(1);
		t.method2(1, "A");
		t.method2(1, "A", "B");
		t.method2(1, "A", "B", "C");
	}

}
