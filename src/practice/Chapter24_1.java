package practice;

// 実行クラス
public class Chapter24_1 {
	public static void main(String[] args) {
		int[] num = {10, 20, 30};
		
		for(int i = 0; i < 5; i++) {
			try {
				System.out.print(num[i]);
				System.out.println((":" + (i + 1) + "回目のループ"));
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("エラー：配列のindexを超えたものを指定しています。");
			}
		}
		System.out.println("終了");
	}
}
