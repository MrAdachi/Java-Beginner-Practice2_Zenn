package practice;

// 設計図クラス
class Test24_3 {
	
	void loop() throws ArrayIndexOutOfBoundsException {
		int[] num = {10, 20, 30};
		for(int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
	}
}

// 実行クラス
public class Chapter24_3 {
	public static void main(String[] args) {
		try {
			Test24_3 obj = new Test24_3();
			obj.loop();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("エラー : 配列のindexを超えたものを指定しています。");
		}
		System.out.println("終了");
	}
}
