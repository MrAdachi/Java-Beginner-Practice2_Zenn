package practice;

public class Chapter11_4 {
	public static void main(String[] args) {
		// スタート値は文にしなければいけない。
		int i1 = 0;
		
		// for(i1; i1 < 5; i1++) {} // コンパイルエラー
		for(i1 += 1; i1 < 5; i1++) {
			System.out.println(i1);
		} // OK
		
		System.out.println("----------------------------");
		
		/* スタート値には、変数の宣言式ではない式を2つ以上指定することが可能。
		   カンマで区切る。*/
		// 増減式も複数の式をカンマ区切りで指定できる。
		int i2 = 0; int i3 = 0; int i4 = 0;
		for (i2++, i3++, i4++; i2 + i3 + i4 < 20; i2++, i3++, i4+=3) {
			System.out.println(i2 + i3 + i4);
		}
		
		System.out.println("----------------------------");
		
		/* スタート値には、変数の宣言式は1つのみ指定できる。
		   それ以上はコンパイルエラー。*/
		// for (int i5 = 0, int i6 = 0; i5 + i6 < 5; i5++) {} // コンパイルエラー
		for(int i7 = 0, i8 = 0; i7 + i8 < 5; i7++, i8++) {
			System.out.println(i7 + i8);
		} // OK（i8は宣言式ではないため　※複数変数のスタート値を設定する場合は、当該方法にてやれば良い。）
		
		System.out.println("----------------------------");
		// for(; ;) {} // OK（ただし無限ループ）
		// for() {} // コンパイルエラー
	}
}
