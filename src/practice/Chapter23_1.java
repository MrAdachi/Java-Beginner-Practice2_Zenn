package practice;

import java.util.ArrayList;

public class Chapter23_1 {
	public static void main(String[] args) {
		// Listの宣言・初期化
		ArrayList<Integer> list = new ArrayList<>();
		Integer i1 = 1;
		int i2 = 2;
		Integer i3 = i1;
		
		list.add(i1); // 要素の追加
		list.add(i2); // intをBoxingによりIntegerに変換
		list.add(i3); // 重複要素
		list.add(3, 4); // index3に、4を追加
		
		System.out.println("list_size:" + list.size()); // 配列と異なりsize()メソッドでListのサイズを取得
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 要素の取得
			// System.out.println(list[i]); コンパイルエラー
		}
		
		System.out.println();
		// 拡張for文も使用可能
		for(Integer i: list) {
			System.out.print(i);
		}
	}
}
