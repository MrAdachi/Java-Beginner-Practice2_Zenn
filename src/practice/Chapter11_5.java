package practice;

public class Chapter11_5 {
	public static void main(String[] args) {
		// 配列の繰り返し処理（シンプル1）
		int[] arr1 = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("-----------------------------------------");
		
		// 配列の要素足し合わせ（シンプル2）
		int[] arr2 = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int j = 0; j < arr2.length; j++) {
			sum += arr2[j];
			System.out.println("現在の配列要素の合計は、" + sum + "です。");
		}
		
	}
}
