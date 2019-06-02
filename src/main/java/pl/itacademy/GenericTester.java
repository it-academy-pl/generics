package pl.itacademy;

public class GenericTester {

	public static void main(String[] args) {

		// Box 1
		Box<Thing> boxOne = new Box<>();
		boxOne.add(new Tool());
		boxOne.add(new Food());
		boxOne.add(new Toy());

		// Box 2
		Box<Thing> boxTwo = new Box<>();
		boxTwo.add(new Toy());
		boxTwo.add(new Tool());
		boxTwo.add(new Food());

		// Box 3
		Box<Food> boxThree = new Box<>();
		boxThree.add(new Food());
		boxThree.add(new Food());
		boxThree.add(new Food());

		// Box 4
		Box<Food> boxFour = new Box<>();
		boxFour.add(new Food());
		boxFour.add(new Food());
		boxFour.add(new Food());

		// Shelf 1 - boxes 1 & 2 (mixed things)
		Shelf<Box<Thing>> shelfOne = new Shelf<>();
		shelfOne.add(boxOne);
		shelfOne.add(boxTwo);

		// Shelf 2 - boxes 3 & 4 (food only)
		Shelf<Box<Food>> shelfTwo = new Shelf<>();
		shelfTwo.add(boxThree);
		shelfTwo.add(boxFour);

		// Room
		Room<Shelf<? extends Box<? extends Thing>>> room = new Room<>();
		room.add(shelfOne);
		room.add(shelfTwo);

		System.out.println(room);
	
	}

}
