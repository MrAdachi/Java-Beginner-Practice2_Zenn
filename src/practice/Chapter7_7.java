package practice;

public class Chapter7_7 {
	public static void main(String[] args) {
		short s1 = 10;
		short s2 = 20;
		
		//	s1 = s1 + 1; コンパイルエラー
		//	short型のs1にint型を代入しようとしているため
		s1 = (short)(s1 + 1); //int → short
		//	インクリメント・デクリメントを行う際は、自動で型変換されない。
		s2 = ++s2;
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
