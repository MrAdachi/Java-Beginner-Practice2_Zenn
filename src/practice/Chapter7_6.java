package practice;

public class Chapter7_6 {
	public static void main(String[] args) {
		//	基本データ型の型変換
		int i = 10;
		double d = 20.0;
		
		d = i; //int → double
		i = (int)d; //double → int
		
		System.out.println(d);
		System.out.println(i);
		foo((short)i); //int → short
	}
	
	static void foo(short s) {
		System.out.println(s);
	}
}
