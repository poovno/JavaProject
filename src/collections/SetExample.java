package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set1 = new HashSet<String>();
	set1.add("Jake");
	set1.add("Lily");
	set1.add("Naina");
	set1.add("Naina");
	set1.add(null);
	System.out.println("The set is " + set1);
	TreeSet<String> set2 = new TreeSet<String>();
	
	set2.add("Zen");
	set2.add("Julli");
	set2.add("Kate");
	
	System.out.println(set2);

	
	}

}
