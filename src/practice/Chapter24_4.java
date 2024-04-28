package practice;

// 設計図クラス
class Test24_4 {
	
	void loop() {
		int[] num = {10, 20, 30};
		for(int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
	}
}

// 実行クラス
public class Chapter24_4 {
	public static void main(String[] args) {
		try {
			Test24_4 obj = new Test24_4();
			obj.loop();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("エラー : 配列のindexを超えたものを指定しています。");
		}
		System.out.println("終了");
	}
}
