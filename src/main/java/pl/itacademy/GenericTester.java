package pl.itacademy;

public class GenericTester {

	public static void main(String[] args) {

		// Box 1 - tools and toys
		Box<Other> boxOne = new Box<>();
		boxOne.add(new Tool());
		boxOne.add(new Toy());
		boxOne.add(new Toy());

		// Box 2 - tools and toys
		Box<Other> boxTwo = new Box<>();
		boxTwo.add(new Toy());
		boxTwo.add(new Tool());
		boxTwo.add(new Tool());

		// Box 3 - food
		Box<Food> boxThree = new Box<>();
		boxThree.add(new Food());
		boxThree.add(new Food());
		boxThree.add(new Food());

		// Box 4 - food
		Box<Food> boxFour = new Box<>();
		boxFour.add(new Food());
		boxFour.add(new Food());
		boxFour.add(new Food());

		// Shelf 1 - boxes 1 & 2 (tools and toys)
		Shelf<Other> shelfOne = new Shelf<>();
		shelfOne.add(boxOne);
		shelfOne.add(boxTwo);

		// Shelf 2 - boxes 3 & 4 (food)
		Shelf<Food> shelfTwo = new Shelf<>();
		shelfTwo.add(boxThree);
		shelfTwo.add(boxFour);

		// Room
		Room room = new Room();
		room.add(shelfOne);
		room.add(shelfTwo);

		System.out.println(room);
	
	}

}
