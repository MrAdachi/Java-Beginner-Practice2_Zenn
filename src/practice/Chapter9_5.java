package practice;

public class Chapter9_5 {
	public static void main(String[] args) {
		// 後置インクリメント・デクリメント
		int x1 = 10;
		int y1;
		int x2 = 10;
		int y2;
		
		y1 = x1++; //y1にx1の値を代入した後に、x1に1足す（文の処理後に+1）
		
		System.out.println(x1);
		System.out.println(x1++); // x1を出力した後に、x1に1を足す（文の処理後に+1）
		System.out.println(y1);
		System.out.println(x1);
		
		y2 = x2--; //y2にx2の値を代入した後に、x2から1引く（文の処理後に-1）
		
		System.out.println(x2);
		System.out.println(x2--); // x2を出力した後に、x2から1を引く（文の処理後に-1）
		System.out.println(y2);
		System.out.println(x2);
		
		System.out.println("----------------------------");
		
		// 前置インクリメント・デクリメント
		int x3 = 10;
		int y3;
		int x4 = 10;
		int y4;
		
		y3 = ++x3; //処理の前にx3に1を足す。
		
		System.out.println(x3);
		System.out.println(++x3); //処理の前にx3に1を足す
		System.out.println(y3);
		System.out.println(x3);
		
		y4 = --x4; //処理の前にx4から1を引く
		
		System.out.println(x4);
		System.out.println(--x4); //処理の前にx4から1を引く
		System.out.println(y4);
		System.out.println(x4);
	}
}
