package practice;

// 設計図クラス
class Bmi12_6 {
	// インスタンス変数（メンバ変数）
	String name;
	
	// 通常メソッド
	public double calcBmi(double height, double weight) {
		height /= 100;
		double result = weight / Math.pow(height, 2);
		return result;
	}
}

// 実行用クラス
public class Chapter12_6 {
	// main()メソッド
	public static void main(String[] args) {
		Bmi12_6 human1 = new Bmi12_6(); // インスタンス化
		
		human1.name = "tanaka";
		
		System.out.println(human1.name); // インスタンス変数の呼び出し
		System.out.println(human1.calcBmi(170, 70)); // 通常メソッドの呼び出し
		
		Bmi12_6 human2 = new Bmi12_6(); // インスタンスの追加
		
		human2.name = "sato";
		
		System.out.println(human2.name);
		System.out.println(human2.calcBmi(180, 50));
	}
}
