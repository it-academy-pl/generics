package pl.itacademy;

public class Toy extends Thing{
	static int index = 1;
	private int number;
	
	Toy() {
		number = index;
		index++;
	}

	@Override
	public String toString() {
		return "Toy " + number;
	}

}
