package practice;

public class Chapter10_6 {
	public static void main(String[] args) {
		int[] i_array = {1, 2, 3};
		
		// 拡張for文 ※配列やコレクションの全要素を順番に取り出す時に使用可能
		for(int i : i_array) {
			
			switch(i) {
				case 1:
					System.out.println("1");
					
				case 2:
					System.out.println("2");
					break;
				default:
					System.out.println("Other");
			}
		}
	}
}
