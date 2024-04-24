package practice;

public class Chapter12_5 {
	int i; // 0を格納
	
	public static void main(String[] args) {
		int[] array = new int[1]; //1つ要素を持った配列インスタンスの生成
		System.out.println(array[0]); //0を出力
		System.out.println(array); //配列自体の参照先を出力
		
		int[] array2 = {}; //空の配列を生成
		//System.out.println(array2[0]); //実行エラー
		System.out.println(array2); //配列自体の参照先を出力
		
		
		//String s; コンパイルエラー
		//int i; コンパイルエラー
	}
}
