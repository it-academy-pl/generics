package pl.itacademy;

import java.util.*;

//Below <> means that the user may only create Shelf<Thing> Shelf<Tool> Shelf<Toy> Shelf<Food> 
//but not Shelf<Integer> for example.
public class Shelf<T extends Thing> {
	static int index = 1;
	private int number;
	
	Shelf() {
		number = index;
		index++;
	}

	protected List<Box<? extends T>> boxes = new LinkedList<>();

// Below <> means that the user may add to the shelf a Box of any descendant of T.
// If T is Thing then he may add Box<Thing> Box<Food> Box<Tool> Box<Toy>.
// If T is Food then he may add only Box<Food>.
	public void add(Box<? extends T> item) {
		boxes.add(item);
	}

	public void clear() {
		boxes.clear();
	}

	@Override
	public String toString() {
		return "Shelf " + number + boxes.toString();
	}

}
