package practice;

// スーパークラス
class Employee {
	private String id = "100";
	public String getId() {
		return id;
	}
}

// サブクラス
class Sales extends Employee {
	private String clientName = "SE";
	public String getClientName() {
		return clientName;
	}
}

public class Chapter21_1 {
	public static void main(String[] args) {
		Sales s = new Sales(); //サブクラスをインスタンス化
		
		// サブクラスのメソッドをコール
		System.out.println(s.getClientName());
		// System.out.println(s.clientName); コンパイルエラー（privateクラスにはアクセス不可）
		
		// スーパークラスのメソッドをコール
		System.out.println(s.getId());
		// System.out.println(s.id); コンパイルエラー（privateメンバにはアクセス不可）
		
		
		
	}
}
