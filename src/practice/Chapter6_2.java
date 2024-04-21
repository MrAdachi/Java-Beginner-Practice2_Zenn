package practice;

public class Chapter6_2 {
	public static void main(String[] args) {
		//	使用可能な変数名
		int var = 1;
		int var111 = 2;
		int _var_ = 3;
		int $var$ = 4;
		
		System.out.println("var：   " + var);
		System.out.println("var111：" + var111);
		System.out.println("_var_： " + _var_);
		System.out.println("$var$： " + $var$);
		
		//	使用不可の変数名
		//	頭文字が数字
		//		int 1var = 5;
		//	"_"および"$"以外の記号
		//		int var-111 = 6;
		//	予約語の使用
		//		int for = 7;
		
		//		System.out.println("1var：    " + 1var);
		//		System.out.println("var-111： " + var-111);
		//		System.out.println("for：     " + for);
	}

}
