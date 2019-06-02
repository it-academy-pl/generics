package pl.itacademy;

import java.util.*;

public class Box<T> extends Thing {
	static int index = 1;

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
		return super.toString() + contents.toString();
	}

}
