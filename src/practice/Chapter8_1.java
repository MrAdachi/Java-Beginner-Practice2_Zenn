package practice;

public class Chapter8_1 {
	public static void main(String[] args) {
		String[] arr1; //配列変数の宣言
		arr1 = new String[3]; //配列のインスタンス化
		
		arr1[0] = "apple"; //要素の追加（配列の0番目）
		arr1[1] = "lemon"; //要素の追加（配列の1番目）
		arr1[2] = "banana"; //要素の追加（配列の2番目）
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println("----------------------------");
		
		String [] arr2 = {"orange", "melon", "grape"}; // 配列の宣言と代入
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		arr2[1] = "strawberry";
		
		System.out.println("Change arr2[1]：" + arr2[1]);
		
		System.out.println("----------------------------");
		
		int[] arr3 = new int[1];
		double[] arr4 = new double[2];
		boolean[] arr5 = new boolean[3];
		String[] arr6 = new String[4];
		
		System.out.println(arr3[0]); //初期値の自動生成 ※配列なので
		System.out.println(arr4[1]);
		System.out.println(arr5[2]);
		System.out.println(arr6[3]);
	}
}
