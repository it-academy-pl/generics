package pl.itacademy;

public class Toy extends Thing{
	static int index = 1;

	Toy() {
		number = index;
		index++;
	}

}
