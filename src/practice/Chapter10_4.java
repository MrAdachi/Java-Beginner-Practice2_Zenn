package practice;

public class Chapter10_4 {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		
		String s = "iの値は";
		String t = "jの値は";
		
		// 三項演算子
		s += i > 10 ? "10より大きい" : "10以下";
		
		System.out.println(s);
		
		// if～else文
		if(j > 10) {
			t += "10より大きい";
		} else {
			t += "10以下";
		}
		
		System.out.println(t);
	}
}
