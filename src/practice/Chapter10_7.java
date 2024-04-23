package practice;

public class Chapter10_7 {
	public static void main(String[] main) {
		int i = 20;
		final byte f_i1 = 10;
		final short f_i2 = 20;
		final int f_i3 = 30;
		
		// final String[] f_s = {"a"};
		
		switch(i) {
			case 0:
				System.out.println("iは0です。");
				break;
				
			case f_i1: // 定数なので正常動作
				System.out.println("iは10です。");
				break;
			// case i: // 変数を指定しているのでエラー発生
			case f_i2: // 定数なので正常動作
				System.out.println("iは20です。");
				break;
			// case f_s[0]: // 定数の配列を指定しているのでエラー発生
			case f_i3: 
				System.out.println("iは30です。");
				break;
			default:
				System.out.println("iは0, 5, 10ではありません。");
		}
		
	}
}
