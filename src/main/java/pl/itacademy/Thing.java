package pl.itacademy;

public abstract class Thing {
	protected int number;

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + number;
	}

}
