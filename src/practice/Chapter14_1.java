package practice;

class Test14_1 {
	private int num; // インスタンス変数にprivate
	
	public Test14_1(int i) {
		num = i;
	} // コンストラクタにpublic
	
	public int getnum() {
		return num;
	} // メソッドにpublic
}

public class Chapter14_1 {
	public static void main(String[] args) {
		Test14_1 t = new Test14_1(100);
		
		/* System.out.println(t.num);
		   コンパイルエラー（privateのアクセス修飾子は同一クラスでのみ使用可能であるため）
		 */
		System.out.println(t.getnum());
	}

}
