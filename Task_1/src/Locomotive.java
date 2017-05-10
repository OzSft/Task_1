public class Locomotive extends Train {
	
	private int coefficientOfPerformance;

	Locomotive(String name, int currentSpeed, double weight, 
				int countOfPassengers, int countOfWheels) {
		super(name, currentSpeed, weight, countOfPassengers, countOfWheels);
	}

	public int getCoefficientOfPerformance() {
		return coefficientOfPerformance;
	}

	public void setCoefficientOfPerformance(int coefficientOfPerformance) {
		this.coefficientOfPerformance = coefficientOfPerformance;
	}
}