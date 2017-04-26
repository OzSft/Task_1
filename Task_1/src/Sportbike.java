
public class Sportbike extends Motorcycle{
	
	private double engineCapacity;

	Sportbike(String name, double currentSpeed, double weight, int countOfPassengers, int countOfWheels) {
		super(name, currentSpeed, weight, countOfPassengers, countOfWheels);
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
}
