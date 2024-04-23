package practice;

public class Chapter11_1 {
	public static void main(String[] args) {
		int i = 10;
		while(i < 15) {
			System.out.println(i);
			i++; //これが無いと無限ループ
		}
	}
}
