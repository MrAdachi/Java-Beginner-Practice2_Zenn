package practice;

public class Chapter7_2 {
	public static void main(String[] args) {
		float var1 = 1.23456789f;
		double var2 = 1.23456789;
		
		// float：有効桁数7桁。切り捨て処理されている。
		System.out.println("var1@float ：" + var1);
		System.out.println("var2@double：" + var2);
	}
}
