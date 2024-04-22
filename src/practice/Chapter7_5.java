package practice;

public class Chapter7_5 {
	public static void main(String[] args) {
		//	データ型の比較（基本データ型）
		int a = 10; int b = 1_0; long c = 10L;
		byte d = 10; char e = 'a';
		float f = 10.0f; double g = 10.0;
		boolean h = true;
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println('a' == e);
		System.out.println(f == g);
		System.out.println(true == h);
		
		System.out.println("----------------------------");
		
		//	データ型の比較（参照型）
		//	配列の比較
		int [] i = {10}; int [] j = {10};
		int [] k = {10}; int [] l = k;
		
		System.out.println(i == j);
		System.out.println(k == l);
		
		System.out.println("----------------------------");
		
		//	データ型の比較（String型）
		String m = "aaa";
		String n = "aaa";
		String o = m.intern(); //String.intern()：同じ領域の文字列を返す
		String p = new String("aaa");
		String q = new String("aaa");
		
		System.out.println(m == n);
		System.out.println(m == o);
		System.out.println(n == o);
		System.out.println(m == p);
		System.out.println(p == q);
		
		System.out.println("----------------------------");
		
		//	文字列データの直接比較
		String r = "吾輩は猫である。";
		String s = "吾輩は猫である。";
		String t = "名前はまだ無い。";
		
		System.out.println(r.equals(s));
		System.out.println(r.equals(t));
		
		System.out.println("----------------------------");
		
		//	データ型の比較（String型とStringBuilder型）
		String u = "aaa";
		String v = u + "A";
		
		String w = "aaa";
		String x = w.concat("A");
		
		StringBuilder y = new StringBuilder("aaa");
		StringBuilder z = y.append("A");
		
		System.out.println(u == v);
		System.out.println(w == x);
		System.out.println(y == z);
		System.out.println(w);
		System.out.println(x);
	}
}
