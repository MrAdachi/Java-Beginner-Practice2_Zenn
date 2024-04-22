package practice;

public class Chapter8_2 {
	public static void main(String[] args) {
		String[][] arr1;
		arr1 = new String[2][2];
		
		arr1[0][0] = "apple1";
		arr1[0][1] = "apple2";
		arr1[1][0] = "apple3";
		arr1[1][1] = "apple4";
		
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[1][1]);
		
		System.out.println("----------------------------");
		
		String[][] arr2 = {{"orange1","orange2","orange3"},{"orange4","orange5","orange6"},{"orange7","orange8","orange9"}};
		
		System.out.println(arr2[0][0]);
		System.out.println(arr2[1][1]);
		System.out.println(arr2[2][2]);
		
		System.out.println("----------------------------");
		
		String[][] arr3 = {{"melon1","melon2"},{"melon3"}};
		System.out.println(arr3[0][0]);
		System.out.println(arr3[0][1]);
		System.out.println(arr3[1][0]);
	}
}
