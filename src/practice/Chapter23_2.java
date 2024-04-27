package practice;

import java.util.HashSet;

public class Chapter23_2 {
	public static void main(String[] args) {
		String[] array = {"A", "B", "C"}; //配列
		
		HashSet<String> Set = new HashSet<>(); // HashSet
		Set.add(array[0]); Set.add(array[1]);
		Set.add(array[2]); Set.add(array[0]);
		
		System.out.println(Set.size());
		for(String s: Set) {
			System.out.print(s);
		}
	}
}
