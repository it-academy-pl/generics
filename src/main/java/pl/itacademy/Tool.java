package pl.itacademy;

public class Tool extends Thing{
	static int index = 1;

	Tool() {
		number = index;
		index++;
	}

}
