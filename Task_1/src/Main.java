public class Main {
	
	public static void main(String[] args){
		
		Locomotive loc1 = new Locomotive("locomotive 1", 100, 2000, 70, 20);
		loc1.setCoefficientOfPerformance(85);
		System.out.println("Coefficient of performance: " + loc1.getCoefficientOfPerformance() + "%");
		
		Sportbike sbike = new Sportbike("Viper V1", 120, 200, 2, 2);
		sbike.setEngineCapacity(1000);
		System.out.println("Engine capacity: " + sbike.getEngineCapacity());
	}

}
