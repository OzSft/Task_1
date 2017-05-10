
public class Motorcycle extends Mashine{
	
	protected double weight;
	protected int countOfPassengers;
	protected int countOfWheels;

	Motorcycle(String name, int currentSpeed, double weight,
				int countOfPassengers, int countOfWheels) {
		super(name, currentSpeed);
		this.countOfPassengers = countOfPassengers;
		this.weight = weight;
		this.countOfWheels = countOfWheels;
	}

	@Override
	public int getSpeed() {
		return currentSpeed;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public int getCountOfPassengers() {
		return countOfPassengers;
	}

	@Override
	public int getCountOfWheels() {
		return countOfWheels;
	}

}
