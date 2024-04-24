package practice;

public class Chapter11_9 {
	public static void main(String[] args) {
		/* ネスト（入れ子）
		   あるものの中に、それと同じ種類のものが入っている構造
		   入れ子構造とも言う。
		*/
		// for文
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				System.out.println(i + "-" + j);
			}
		}
		
		System.out.println("-----------------------------------------");
		
		// if文
		int a = 10;
		String b = "モグラ";
		
		if(a > 10) {
			if(b == "モグラ") {
				System.out.println("aは10より大きいかつモグラです。");
			} else {
				System.out.println("aは10より大きいですがモグラではありません。");
			}
		} else if (a == 10) {
			if(b == "モグラ") {
				System.out.println("aは10かつモグラです。");
			} else {
				System.out.println("aは10ですがモグラではありません。");
			}
		} else {
			if(b == "モグラ") {
				System.out.println("aは10未満かつモグラです。");
			} else {
				System.out.println("aは10未満ですがモグラではありません。");
			}
		}
	}
}
