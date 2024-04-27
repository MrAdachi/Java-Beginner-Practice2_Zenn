package practice;

interface Test22_4A {}
class Test22_4B {}
class Test22_4C extends Test22_4B {}
class Test22_4D {}
abstract class Test22_4E {}

public class Chapter22_4 {
	public static void main(String[] args) {
		Test22_4C obj = new Test22_4C();
		System.out.println(obj instanceof Test22_4A);
		System.out.println(obj instanceof Test22_4B);
		System.out.println(obj instanceof Test22_4C);
		// System.out.println(obj instanceof Test22_4D);　コンパイルエラー
		// System.out.println(obj instanceof Test22_4E);　コンパイルエラー
	}
}
