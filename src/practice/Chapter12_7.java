package practice;
class Bmi12_7 {
	String name;
	
	// コンストラクタの定義
	Bmi12_7(String s) {
		name = s;
	}
	
	public double calcBmi(double height, double weight) {
		height /= 100;
		double result = weight / Math.pow(height, 2);
		return result;
	}
	
}

public class Chapter12_7 {
	public static void main(String[] args) {
		Bmi12_7 human1 = new Bmi12_7("tanaka"); // インスタンス生成＆コンストラクタ実行
		
		System.out.println(human1.name);
		System.out.println(human1.calcBmi(170, 70));
		
		
		Bmi12_7 human2 = new Bmi12_7("sato"); // インスタンス生成＆コンストラクタ実行
		
		System.out.println(human2.name);
		System.out.println(human2.calcBmi(180, 50));
	}

}
