package setAndmap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class Set01 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new TreeSet<>(Arrays.asList(0,5,6,4,2,8,9));
		
		for(int i = 0; i < 10; i++) {
			int valorA = random.nextInt(30);
			System.out.print(valorA + " ");
			a.add(valorA);
		}
		
		System.out.println();
		for(Integer a1 : a) {
			System.out.println(a1);
		}
		
		
	}

}
