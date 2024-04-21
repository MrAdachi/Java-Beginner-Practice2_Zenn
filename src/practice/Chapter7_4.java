package practice;

public class Chapter7_4 {
	public static void main(String[] args) {
		char var1 = 'a';
		String var2 = "Hello World";
		
		System.out.println("var1：" + var1);
		System.out.println("var2：" + var2);
		
		String var3 = "abcdef";
		
		//	引数と一致するインデックス文字を返す
		System.out.println(var3.charAt(1));
		
		System.out.println(var3.equals("abcde"));
		//	変数の文字列を返す
		System.out.println(var3.intern());
		//	引数の文字が最初に現れたインデックスを返す
		System.out.println(var3.indexOf('c'));
		
		System.out.println(var3.length());
		//	第一引数に一致する文字を第二引数の文字に置き換えた文字列を返す
		System.out.println(var3.replace('a','z'));
		//	引数で指定したインデックスから最後までの文字列を返す
		System.out.println(var3.substring(4));
		
		
		StringBuilder var4 = new StringBuilder("ghijklmn");
		
		//　末尾に引数の文字列を追加したものを返す
		System.out.println(var4.append("zzz"));
		//	第一引数で指定したインデックス箇所に、第二引数の文字を挿入ものを返す
		System.out.println(var4.insert(2, "zzz"));
		//	第一引数から第二引数の1つ前のインデックスの文字を削除したものを返す
		System.out.println(var4.delete(0, 5));
		//	第一引数から第二引数の一つ前のインデックスまでの文字列を第三引数の文字列で置き換えたものを返す
		System.out.println(var4.replace(0, 5, "zzz"));
		//	引数で指定したインデックスから最後までの文字列を返す
		System.out.println(var4.substring(4));
		
		System.out.println(var4.length());
	}
}
