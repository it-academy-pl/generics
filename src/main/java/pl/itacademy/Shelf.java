package pl.itacademy;

public class Shelf<T> extends Box<T> {
	static int index = 1;

	Shelf() {
		number = index;
		index++;
	}
}
