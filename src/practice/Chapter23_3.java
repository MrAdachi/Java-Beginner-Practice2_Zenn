package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

// 実行クラス
public class Chapter23_3 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(0, "A"); // キーと値を追加
		map.put(1, "B"); // キーと値を追加
		map.put(2, "A"); // キーと値を追加
		map.put(1, "C"); // キーと値を追加
		
		// キーの出力
		for(int i = 0; i < map.size(); i++) {
			System.out.print(map.get(i));
		}
		System.out.println();
		
		// キーの出力
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.print(key);
		}
		System.out.println();
		
		// 値の出力
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.print(value);
		}
	}
}
