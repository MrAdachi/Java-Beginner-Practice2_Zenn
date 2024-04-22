package practice;

public class Chapter7_8 {
	public static void main(String[] args) {
		int i = 10;
		Integer i_class = 10;
		
		System.out.println(i == i_class); //値自体の比較
		
		i_class = i; // Boxing
		int i2 = i_class; // unBoxing
		add(i2); // メソッドの引数で自動変換
		
		double d = 1; // 基本データ型同士の自動型変換
		// Double d_class = 10; Boxingにおいては、自動型変換できない（コンパイルエラー）
		// d_classのBoxing(int → double)をやるなら・・・
		double d1_class = 10;
		Double d2_class = d1_class;
		
		System.out.println(d);
		System.out.println(d2_class);
		
	}
	
	static void add(Integer i_class) {
		int i = i_class + 10; // Integerとintの計算
		System.out.println(i);
	}
}
