package practice;

class Test12_2{
	 int instanceVal = 1;
	 static int staticVal = 2;
	 
	 void method1() {
		 System.out.println(instanceVal);
	 }
	 
	 void method2() {
		 System.out.println(staticVal);
	 }
	 
	 /* static void method3() {
		 System.out.println(instanceVal);
	 } staticメソッドから同クラスのインスタンス変数にアクセスしているのでエラー発生
	 */
	 
	 static void method4() {
		 System.out.println(staticVal);
	 }
	 
	 static void method5() {
		 Test12_2 t2 = new Test12_2();
		 System.out.println(t2.instanceVal);
	 }
}

public class Chapter12_2 {
	public static void main(String[] args) {
		
		System.out.println(Test12_2.staticVal);
		Test12_2.method4();
		Test12_2.method5();
		
		System.out.println("-----------------------------------------");
		
		Test12_2 t1 = new Test12_2();
		
		System.out.println(t1.instanceVal);
		t1.method1();
		t1.method2();
		
		System.out.println("-----------------------------------------");
		
		System.out.println(t1.staticVal);
		t1.method4();
		t1.method5();
	}
}
