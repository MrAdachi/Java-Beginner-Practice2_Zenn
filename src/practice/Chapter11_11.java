package practice;

public class Chapter11_11 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.println("" + i + j);
				
				if(i == 1 && j == 0) {
					System.out.println("外側のfor文を終了");
					// 1番内側の繰り返し処理から抜ける。（それより外側のループからは抜けない。）
					break; // カリキュラムには書かれていないが、おそらく書く必要あり。
				}
			}
		}
	}
}
