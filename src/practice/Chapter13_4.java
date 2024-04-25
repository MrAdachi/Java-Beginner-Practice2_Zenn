package practice;

class Test13_4 {
	
	int diameter;
	int radius;
	double pi;
	double circumference;
	double area;
	
	Test13_4(int d){
		diameter = d;
		radius = diameter/2;
		pi = 3.14;
	}
	
	double ci() {
		circumference = diameter * pi;
		return circumference;
	}
	
	double ar() {
		area = Math.pow(radius, 2) * pi;
		return area;
	}
}


public class Chapter13_4 {
	public static void main(String[] args) {
		
		int D = 10;
		
		// メンバの生成タイミング
		Test13_4 t; // Test13_4クラスのstaticメンバ生成（クラスコール）
		t = new Test13_4(D); // Test13_4クラスを元にしたインスタンスのインスタンスメンバ生成（インスタンス生成）
		
		// 円周の算出
		System.out.println(t.ci());
		
		// 円の面積算出
		System.out.println(t.ar());
	}
}
