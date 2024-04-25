package practice;

class Test14_2 {
	private final String name;
	private final int id;
	
	public Test14_2(String s, int i) {
		this.name = s;
		this.id = i;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
}

public class Chapter14_2 {
	public static void main(String... a) {
		Test14_2 t = new Test14_2("tanaka", 1);
		
		/* t.name = "Sato";
		   インスタンス変数はprivateが一般的。
		   （むやみな変更の防止を目的）
		   そのためインスタンス変数を変更する際に、
		   このような方法を取るのは推奨しない。
		*/
		
		System.out.println(t.getName());
		System.out.println(t.getId());
	}
}
