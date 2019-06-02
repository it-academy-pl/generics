package pl.itacademy;

public class Food extends Thing{
	static int index = 1;

	Food() {
		number = index;
		index++;
	}

}
