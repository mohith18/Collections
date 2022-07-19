import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> name = new ArrayList<String>();
		name.add("Mohith");
		name.add("Harsha");
		name.add("Rajesh");
		System.out.println(name);

		// creating vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec = new Vector();
		vec.addElement(1);
		vec.addElement(2);
		vec.addElement(3);
		System.out.println(vec);

		// creating linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Ajay");
		names.add("Sudheer");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			// creating hashset
			System.out.println("\n");
			System.out.println("HashSet");
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(11);
			set.add(12);
			set.add(13);
			set.add(14);
			System.out.println(set);

			// creating linkedhashset
			System.out.println("\n");
			System.out.println("LinkedHashSet");
			LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
			set2.add(110);
			set2.add(130);
			set2.add(120);
			set2.add(140);
			System.out.println(set2);
		}
	}

}
