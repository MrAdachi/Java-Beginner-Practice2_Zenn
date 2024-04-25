package practice;

class Test12_10 {
	
	void method(int ...a) {
		System.out.println("可変長引数が優先");
	}
	
	void method(int i) {
		System.out.println("引数が優先");
	}
}


public class Chapter12_10 {
	public static void main(String[] args) {
		Test12_10 t = new Test12_10();
		
		/* 引数のメソッドが優先。
		   可変長引数のメソッドは実行されない。
		 */
		t.method(1); 
	}
}
