public class DieselTrain extends Train {

	private double engineCapacity;
	
	DieselTrain(String name, int currentSpeed, double weight, int countOfPassengers, int countOfWheels) {
		super(name, currentSpeed, weight, countOfPassengers, countOfWheels);
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

}
