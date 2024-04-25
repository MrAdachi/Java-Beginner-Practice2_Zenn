package practice;

class Test17 {
	// 基本データ型の受け取り
	int methodA(int i) {
		i += 10;
		return i;
	}
	
	// 参照型の受け取り
	int methodB(int[] array) {
		array[0] += 10;
		return array[0];
	}
}

public class Chapter17 {
	public static void main(String[] args) {
		Test17 t = new Test17();
		int i = 10;
		int[] array = {10};
		
		System.out.println("メソッドに渡す前の変数：" + i);
		System.out.println("メソッドに渡す前の変数：" + array[0]);
		
		//メソッドの実行
		System.out.println(t.methodA(i));
		System.out.println(t.methodB(array));
		
		System.out.println("メソッド実行後の変数：" + i);
		System.out.println("メソッド実行後の変数：" + array[0]); // 渡した値も更新
	}
}
