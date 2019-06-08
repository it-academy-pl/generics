package pl.itacademy;

public class Tool extends Other {
	static int index = 1;
	private int number;

	Tool() {
		number = index;
		index++;
	}

	@Override
	public String toString() {
		return "Tool " + number;
	}

}
