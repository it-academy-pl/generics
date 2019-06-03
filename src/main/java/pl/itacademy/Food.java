package pl.itacademy;

public class Food extends Thing{
	static int index = 1;
	private int number;
	
	Food() {
		number = index;
		index++;
	}
	
	@Override
	public String toString() {
		return "Food " + number;
	}


}
