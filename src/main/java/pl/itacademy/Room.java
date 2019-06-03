package pl.itacademy;

import java.util.*;

public class Room{

	protected List<Shelf<? extends Thing>> shelfs = new LinkedList<>();

	// Below <> means that the user may add to the room a Shelf of any descendant of Thing.
	// It means that he may add Shelf<Thing> Shelf<Food> Shelf<Tool> Shelf<Toy>.
	public void add(Shelf<? extends Thing> item) {
		shelfs.add(item);
	}

	public void clear() {
		shelfs.clear();
	}

	@Override
	public String toString() {
		return "Room " + shelfs.toString();
	}

}
