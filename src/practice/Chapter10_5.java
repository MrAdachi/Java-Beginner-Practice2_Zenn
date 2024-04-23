package practice;

public class Chapter10_5 {
	public static void main(String[] args) {
		int i = 5;
		
		switch(i) {
		case 0:
			System.out.println("iは0です。");
			break;
		case 5:
			System.out.println("iは5です。");
			break;
		case 10:
			System.out.println("iは10です。");
			break;
		default:
			System.out.println("iは0,5,10ではありません。");
		}
	}
}
