package practice;

public class Chapter11_6 {
	public static void main(String[] args) {
		char[] c_arry1 = {'a', 'b', 'c'};
		
		// c1_arryの要素が1つずつc1に格納される
		for(char c1 : c_arry1) {
			System.out.println(c1);
		}
		
		System.out.println("-----------------------------------------");
		
		char[] c_arry2 = {'d', 'e', 'f'};
		
		/* ローカル変数型推論のvarを用いて要素格納変数と要素のデータ型の差分を無くしている。
           変数cには、varがついているので、データ型を自動でセットしてくれる。
		 */
		for(var c2 : c_arry2) {
			System.out.println(c2);
		}
	}
}
