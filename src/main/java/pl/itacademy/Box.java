package pl.itacademy;

import java.util.*;

// Below <> means that the user may only create Box<Thing> Box<Tool> Box<Toy> Box<Food> 
// but not Box<Integer> for example.
public class Box<T extends Thing> {
	static int index = 1;
	private int number;
	
	Box() {
		number = index;
		index++;
	}

	protected List<T> contents = new LinkedList<>();

	public void add(T item) {
		contents.add(item);
	}

	public void clear() {
		contents.clear();
	}

	@Override
	public String toString() {
		return "Box " + number + contents.toString();
	}

}
