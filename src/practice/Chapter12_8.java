package practice;

class Test12_8 {
	
	void test() {
		System.out.println("test1");
	}
	
	void test(String s) {
		System.out.println("test2");
	}
	
	void test(int i) {
		System.out.println("test3");
	}
	
	/* void test(String s, int i) {
		System.out.println("test4");
	}
	　 コンパイルエラー
	*/
	
	String test(String s, int i) {
		System.out.println("test5");
		String return_test = s + i;
		return return_test;
	}
	
	/* void test(String s2, int i2){
		System.out.println("test6");
	}
	コンパイルエラー
	*/
}

public class Chapter12_8 {
	public static void main(String[] args) {
		Test12_8 t = new Test12_8();
		
		t.test();
		t.test("test");
		t.test(111);
		System.out.println(t.test("test", 111));
	}
}
