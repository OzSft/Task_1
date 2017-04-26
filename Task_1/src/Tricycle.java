
public class Tricycle extends Motorcycle{
	
	private double bascketHeight;
	private double bascketWidth;
	private double bascketLenght;
	
	Tricycle(String name, double currentSpeed, double weight, int countOfPassengers, int countOfWheels) {
		super(name, currentSpeed, weight, countOfPassengers, countOfWheels);
	}

	public double getBascketHeight() {
		return bascketHeight;
	}

	public void setBascketHeight(double bascketHeight) {
		this.bascketHeight = bascketHeight;
	}

	public double getBascketWidth() {
		return bascketWidth;
	}

	public void setBascketWidth(double bascketWidth) {
		this.bascketWidth = bascketWidth;
	}

	public double getBascketLenght() {
		return bascketLenght;
	}

	public void setBascketLenght(double bascketLenght) {
		this.bascketLenght = bascketLenght;
	}

}
