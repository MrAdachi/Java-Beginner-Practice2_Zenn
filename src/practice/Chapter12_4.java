package practice;

public class Chapter12_4 {
	int i; // 0を格納
	static int j; // 0を格納
	static int i2 = 10;
	
	public static void main(String[] args) {
		// String i = new String();
		// System.out.println(i);
		
		int i = 1;
		int k = Chapter12_4.j; // メンバ変数の初期値が0である証拠
		// public int i = 1;
		System.out.println(i);
		System.out.println(k);
		
		Chapter12_4 t_instance = new Chapter12_4();
		System.out.println(t_instance.i);
		
		System.out.println(Chapter12_4.i2);
		
		if(i == 1) {
			String s = "変数sは、if文ブロックのみ参照可";
			System.out.println(s);
			System.out.println(i);
			System.out.println(t_instance.i);
			System.out.println(Chapter12_4.i2);
		}
		// System.out.println(s); コンパイルエラー
	}
}
