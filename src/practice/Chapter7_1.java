package practice;

public class Chapter7_1 {
	public static void main(String[] args) {
		byte var1 = 100;
		short var2 = 30000;
		int var3 = 200000000;
		long var4 = 123456789000L;
		
		System.out.println("var1@byte ：" + var1);
		System.out.println("var2@short：" + var2);
		System.out.println("var3@int  ：" + var3);
		System.out.println("var4@long ：" + var4);		
		
		//	各データ型で表現可能な数字の最大値を産出
		byte var5 = (byte)((Math.pow(2, 8) - 2)/2);
		short var6 = (short)((Math.pow(2, 16) - 2)/2);
		int var7 = (int)((Math.pow(2, 32) - 2)/2);
		long var8 = (long)((Math.pow(2, 64) - 2)/2);
		
		System.out.println("var5@bytemax ：" + var5);
		System.out.println("var6@shortmax：" + var6);
		System.out.println("var7@intmax  ：" + var7);
		System.out.println("var8@longmax ：" + var8);
	}
}
