package practice;

class Test21_4 {
	int id1;
	int id2;
	void setId1(int id1) {
		/* ローカル変数（左辺のid1）は、引数として宣言している変数
		   ＝メソッドに渡す値を引数に代入している（意味なし）
		*/
		id1 = id1;
	}
	
	void setId2(int id2) {
		this.id2 = id2;
	}
}

public class Chapter21_4 {
	public static void main(String[] args) {
		Test21_4 t = new Test21_4();
		
		t.setId1(10);
		t.setId2(10);
		// int id1(インスタンス変数にはsetId1メソッドで代入した引数の値は入っていない。)
		System.out.println(t.id1);
		System.out.println(t.id2);
	}
}
