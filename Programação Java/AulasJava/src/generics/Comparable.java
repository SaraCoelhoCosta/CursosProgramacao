package generics;

import java.util.TreeSet;

public class Comparable {

	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(8);
		numbers.add(9);
		numbers.add(123);
		numbers.add(-13);
		
		System.out.println("Numeros ordenados(TreeSet):");
		for(Integer n: numbers) {
			System.out.println(n);
		}
		
	}
}
