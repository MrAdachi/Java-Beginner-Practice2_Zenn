package practice;

public class Chapter11_3 {
	public static void main(String[] args) {
		// for文（基本）
		for(int i = 0; i <= 4; i++) {
			System.out.println("iの値は現在" + i + "です。");
		}
		
		System.out.println("----------------------------");
		
		// for文（省略）
		// 初期値の省略
		int j = 0;
		for(; j < 5; j++) {
			System.out.println("jの値は現在" + j + "です。");
		}
		
		System.out.println("----------------------------");
		
		// 増減式の省略
		for(int k = 0; k < 5;) {
			System.out.println("kの値は現在" + k + "です。");
			k++; // インクリメントが無いと無限ループ
		}
	}
}
