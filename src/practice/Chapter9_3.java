package practice;

public class Chapter9_3 {
	public static void main(String[] args) {
		// 論理演算子
		int x = 10;
		int y = 2;
		
		System.out.println(x > 2 && x > 15); //xは2より大きい、かつ15より大きい
		System.out.println(y >= 10 || y == 2); //yは10以上、または2と等しい	
		
		System.out.println("----------------------------");
		
		// &と&&の違い
		int num1 = 10, num2 = 10, num3 = 10, num4 = 10, num5 = 10, num6 = 10;
		
		boolean result1 = num1++ > 10;
		boolean result2 = ++num2 > 10;
		
		System.out.println(result1 + "　" + result2);
		
		boolean result3 = num3++ > 10 & ++num4 > 10;
		System.out.println(result3 + ":" + num3 + ":" + num4);
		
		boolean result4 = num5++ > 10 && ++num6 > 10;
		System.out.println(result4 + ":" + num5 + ":" + num6);
	}
}
